/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.controlador;

import br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Colaborador;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author Aluísio
 */
public class ColaboradorConverter implements Converter {

    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        Long id = new Long(string);
        ColaboradorController controller = (ColaboradorController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "colaborador");
        return controller.getJpaController().find(id);
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Colaborador) {
            Colaborador o = (Colaborador) object;
            return o.getCod() == null ? "" : o.getCod().toString();
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Colaborador");
        }
    }
    
}
