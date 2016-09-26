/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.controlador;

import br.edu.ifpb.ads.praticas.immobilly.beansessao.ColaboradorFacade;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.faces.FacesException;
import javax.annotation.Resource;
import javax.transaction.UserTransaction;
import br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil;
import br.edu.ifpb.ads.praticas.immobilly.controlador.util.PagingInfo;
import br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Colaborador;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Aluísio
 */
public class ColaboradorController {

    public ColaboradorController() {
        pagingInfo = new PagingInfo();
        converter = new ColaboradorConverter();
    }
    private Colaborador colaborador = null;
    private List<Colaborador> colaboradorItems = null;
    private ColaboradorFacade jpaController = null;
    private ColaboradorConverter converter = null;
    private PagingInfo pagingInfo = null;
    @Resource
    private UserTransaction utx = null;
    @PersistenceUnit(unitName = "manager1")
    private EntityManagerFactory emf = null;

    public PagingInfo getPagingInfo() {
        if (pagingInfo.getItemCount() == -1) {
            pagingInfo.setItemCount(getJpaController().count());
        }
        return pagingInfo;
    }

    public ColaboradorFacade getJpaController() {
        if (jpaController == null) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            jpaController = (ColaboradorFacade) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "colaboradorJpa");
        }
        return jpaController;
    }

    public SelectItem[] getColaboradorItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), false);
    }

    public SelectItem[] getColaboradorItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), true);
    }

    public Colaborador getColaborador() {
        if (colaborador == null) {
            colaborador = (Colaborador) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentColaborador", converter, null);
        }
        if (colaborador == null) {
            colaborador = new Colaborador();
        }
        return colaborador;
    }

    public String listSetup() {
        reset(true);
        return "colaborador_list";
    }

    public String createSetup() {
        reset(false);
        colaborador = new Colaborador();
        return "colaborador_create";
    }

    public String create() {
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().create(colaborador);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Colaborador was successfully created.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return listSetup();
    }

    public String detailSetup() {
        return scalarSetup("colaborador_detail");
    }

    public String editSetup() {
        return scalarSetup("colaborador_edit");
    }

    private String scalarSetup(String destination) {
        reset(false);
        colaborador = (Colaborador) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentColaborador", converter, null);
        if (colaborador == null) {
            String requestColaboradorString = JsfUtil.getRequestParameter("jsfcrud.currentColaborador");
            JsfUtil.addErrorMessage("The colaborador with id " + requestColaboradorString + " no longer exists.");
            return relatedOrListOutcome();
        }
        return destination;
    }

    public String edit() {
        String colaboradorString = converter.getAsString(FacesContext.getCurrentInstance(), null, colaborador);
        String currentColaboradorString = JsfUtil.getRequestParameter("jsfcrud.currentColaborador");
        if (colaboradorString == null || colaboradorString.length() == 0 || !colaboradorString.equals(currentColaboradorString)) {
            String outcome = editSetup();
            if ("colaborador_edit".equals(outcome)) {
                JsfUtil.addErrorMessage("Could not edit colaborador. Try again.");
            }
            return outcome;
        }
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().edit(colaborador);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Colaborador was successfully updated.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return detailSetup();
    }

    public String remove() {
        String idAsString = JsfUtil.getRequestParameter("jsfcrud.currentColaborador");
        Long id = new Long(idAsString);
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().remove(getJpaController().find(id));
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Colaborador was successfully deleted.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return relatedOrListOutcome();
    }

  private String relatedOrListOutcome() {
        Logger l = LogManager.getLogger(ColaboradorController.class);
        String relatedControllerOutcome = relatedControllerOutcome();
        if ((l.isErrorEnabled())) {
            return relatedControllerOutcome;
        }
        return listSetup();
    }

    public List<Colaborador> getColaboradorItems() {
        if (colaboradorItems == null) {
            getPagingInfo();
            colaboradorItems = getJpaController().findRange(new int[]{pagingInfo.getFirstItem(), pagingInfo.getFirstItem() + pagingInfo.getBatchSize()});
        }
        return colaboradorItems;
    }

    public String next() {
        reset(false);
        getPagingInfo().nextPage();
        return "colaborador_list";
    }

    public String prev() {
        reset(false);
        getPagingInfo().previousPage();
        return "colaborador_list";
    }

    private String relatedControllerOutcome() {
        String relatedControllerString = JsfUtil.getRequestParameter("jsfcrud.relatedController");
        String relatedControllerTypeString = JsfUtil.getRequestParameter("jsfcrud.relatedControllerType");
        if (relatedControllerString != null && relatedControllerTypeString != null) {
            FacesContext context = FacesContext.getCurrentInstance();
            Object relatedController = context.getApplication().getELResolver().getValue(context.getELContext(), null, relatedControllerString);
            try {
                Class<?> relatedControllerType = Class.forName(relatedControllerTypeString);
                Method detailSetupMethod = relatedControllerType.getMethod("detailSetup");
                return (String) detailSetupMethod.invoke(relatedController);
            } catch (ClassNotFoundException e) {
                throw new FacesException(e);
            } catch (NoSuchMethodException e) {
                throw new FacesException(e);
            } catch (IllegalAccessException e) {
                throw new FacesException(e);
            } catch (InvocationTargetException e) {
                throw new FacesException(e);
            }
        }
        return null;
    }

    private void reset(boolean resetFirstItem) {
        colaborador = null;
        colaboradorItems = null;
        pagingInfo.setItemCount(-1);
        if (resetFirstItem) {
            pagingInfo.setFirstItem(0);
        }
    }

    public void validateCreate(FacesContext facesContext, UIComponent component, Object value) {
        Colaborador newColaborador = new Colaborador();
        String newColaboradorString = converter.getAsString(FacesContext.getCurrentInstance(), null, newColaborador);
        String colaboradorString = converter.getAsString(FacesContext.getCurrentInstance(), null, colaborador);
        if (!newColaboradorString.equals(colaboradorString)) {
            createSetup();
        }
    }

    public Converter getConverter() {
        return converter;
    }
    
}
