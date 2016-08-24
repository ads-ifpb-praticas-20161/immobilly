/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.mbean.controler;

import br.edu.ifpb.ads.praticas.immobilly.mbean.controler.exceptions.NonexistentEntityException;
import br.edu.ifpb.ads.praticas.immobilly.mbean.controler.exceptions.PreexistingEntityException;
import br.edu.ifpb.ads.praticas.immobilly.mbean.controler.exceptions.RollbackFailureException;
import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Abastecimento;
import br.edu.ifpb.ads.praticas.immobilly.shared.beans.AbastecimentoId;
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
public class AbastecimentoJpaController implements Serializable {

    public AbastecimentoJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Abastecimento abastecimento) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (abastecimento.getAbastecimentoId() == null) {
            abastecimento.setAbastecimentoId(new AbastecimentoId());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(abastecimento);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findAbastecimento(abastecimento.getAbastecimentoId()) != null) {
                throw new PreexistingEntityException("Abastecimento " + abastecimento + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Abastecimento abastecimento) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            abastecimento = em.merge(abastecimento);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                AbastecimentoId id = abastecimento.getAbastecimentoId();
                if (findAbastecimento(id) == null) {
                    throw new NonexistentEntityException("The abastecimento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(AbastecimentoId id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Abastecimento abastecimento;
            try {
                abastecimento = em.getReference(Abastecimento.class, id);
                abastecimento.getAbastecimentoId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The abastecimento with id " + id + " no longer exists.", enfe);
            }
            em.remove(abastecimento);
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

    public List<Abastecimento> findAbastecimentoEntities() {
        return findAbastecimentoEntities(true, -1, -1);
    }

    public List<Abastecimento> findAbastecimentoEntities(int maxResults, int firstResult) {
        return findAbastecimentoEntities(false, maxResults, firstResult);
    }

    private List<Abastecimento> findAbastecimentoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Abastecimento.class));
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

    public Abastecimento findAbastecimento(AbastecimentoId id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Abastecimento.class, id);
        } finally {
            em.close();
        }
    }

    public int getAbastecimentoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Abastecimento> rt = cq.from(Abastecimento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}