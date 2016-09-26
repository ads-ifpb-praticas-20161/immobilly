/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.controlador;

import br.edu.ifpb.ads.praticas.immobilly.beansessao.FornecedorFacade;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.faces.FacesException;
import javax.annotation.Resource;
import javax.transaction.UserTransaction;
import br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil;
import br.edu.ifpb.ads.praticas.immobilly.controlador.util.PagingInfo;
import br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Fornecedor;
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
public class FornecedorController {

    public FornecedorController() {
        pagingInfo = new PagingInfo();
        converter = new FornecedorConverter();
    }
    private Fornecedor fornecedor = null;
    private List<Fornecedor> fornecedorItems = null;
    private FornecedorFacade jpaController = null;
    private FornecedorConverter converter = null;
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

    public FornecedorFacade getJpaController() {
        if (jpaController == null) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            jpaController = (FornecedorFacade) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "fornecedorJpa");
        }
        return jpaController;
    }

    public SelectItem[] getFornecedorItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), false);
    }

    public SelectItem[] getFornecedorItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), true);
    }

    public Fornecedor getFornecedor() {
        if (fornecedor == null) {
            fornecedor = (Fornecedor) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentFornecedor", converter, null);
        }
        if (fornecedor == null) {
            fornecedor = new Fornecedor();
        }
        return fornecedor;
    }

    public String listSetup() {
        reset(true);
        return "fornecedor_list";
    }

    public String createSetup() {
        reset(false);
        fornecedor = new Fornecedor();
        return "fornecedor_create";
    }

    public String create() {
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().create(fornecedor);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Fornecedor was successfully created.");
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
        return scalarSetup("fornecedor_detail");
    }

    public String editSetup() {
        return scalarSetup("fornecedor_edit");
    }

    private String scalarSetup(String destination) {
        reset(false);
        fornecedor = (Fornecedor) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentFornecedor", converter, null);
        if (fornecedor == null) {
            String requestFornecedorString = JsfUtil.getRequestParameter("jsfcrud.currentFornecedor");
            JsfUtil.addErrorMessage("The fornecedor with id " + requestFornecedorString + " no longer exists.");
            return relatedOrListOutcome();
        }
        return destination;
    }

    public String edit() {
        String fornecedorString = converter.getAsString(FacesContext.getCurrentInstance(), null, fornecedor);
        String currentFornecedorString = JsfUtil.getRequestParameter("jsfcrud.currentFornecedor");
        if (fornecedorString == null || fornecedorString.length() == 0 || !fornecedorString.equals(currentFornecedorString)) {
            String outcome = editSetup();
            if ("fornecedor_edit".equals(outcome)) {
                JsfUtil.addErrorMessage("Could not edit fornecedor. Try again.");
            }
            return outcome;
        }
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().edit(fornecedor);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Fornecedor was successfully updated.");
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
        String idAsString = JsfUtil.getRequestParameter("jsfcrud.currentFornecedor");
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
                JsfUtil.addSuccessMessage("Fornecedor was successfully deleted.");
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
        Logger l = LogManager.getLogger(FornecedorController.class);
        String relatedControllerOutcome = relatedControllerOutcome();
        if ((l.isErrorEnabled())) {
            return relatedControllerOutcome;
        }
        return listSetup();
    }

    public List<Fornecedor> getFornecedorItems() {
        if (fornecedorItems == null) {
            getPagingInfo();
            fornecedorItems = getJpaController().findRange(new int[]{pagingInfo.getFirstItem(), pagingInfo.getFirstItem() + pagingInfo.getBatchSize()});
        }
        return fornecedorItems;
    }

    public String next() {
        reset(false);
        getPagingInfo().nextPage();
        return "fornecedor_list";
    }

    public String prev() {
        reset(false);
        getPagingInfo().previousPage();
        return "fornecedor_list";
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
        fornecedor = null;
        fornecedorItems = null;
        pagingInfo.setItemCount(-1);
        if (resetFirstItem) {
            pagingInfo.setFirstItem(0);
        }
    }

    public void validateCreate(FacesContext facesContext, UIComponent component, Object value) {
        Fornecedor newFornecedor = new Fornecedor();
        String newFornecedorString = converter.getAsString(FacesContext.getCurrentInstance(), null, newFornecedor);
        String fornecedorString = converter.getAsString(FacesContext.getCurrentInstance(), null, fornecedor);
        if (!newFornecedorString.equals(fornecedorString)) {
            createSetup();
        }
    }

    public Converter getConverter() {
        return converter;
    }
    
}
