/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.mbean.controler;

import br.edu.ifpb.ads.praticas.immobilly.mbean.controler.exceptions.NonexistentEntityException;
import br.edu.ifpb.ads.praticas.immobilly.mbean.controler.exceptions.PreexistingEntityException;
import br.edu.ifpb.ads.praticas.immobilly.mbean.controler.exceptions.RollbackFailureException;
import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Colaborador;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

/**
 *
 * @author ajp
 */
public class ColaboradorJpaController implements Serializable {

    public ColaboradorJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Colaborador colaborador) throws PreexistingEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(colaborador);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findColaborador(colaborador.getCod()) != null) {
                throw new PreexistingEntityException("Colaborador " + colaborador + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Colaborador colaborador) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            colaborador = em.merge(colaborador);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = colaborador.getCod();
                if (findColaborador(id) == null) {
                    throw new NonexistentEntityException("The colaborador with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Colaborador colaborador;
            try {
                colaborador = em.getReference(Colaborador.class, id);
                colaborador.getCod();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The colaborador with id " + id + " no longer exists.", enfe);
            }
            em.remove(colaborador);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Colaborador> findColaboradorEntities() {
        return findColaboradorEntities(true, -1, -1);
    }

    public List<Colaborador> findColaboradorEntities(int maxResults, int firstResult) {
        return findColaboradorEntities(false, maxResults, firstResult);
    }

    private List<Colaborador> findColaboradorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Colaborador.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Colaborador findColaborador(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Colaborador.class, id);
        } finally {
            em.close();
        }
    }

    public int getColaboradorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Colaborador> rt = cq.from(Colaborador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
