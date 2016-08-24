/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 *
 * @author jederson
 */
@Embeddable
public class CNH implements Serializable {
    
    private String renach;
    private String categoria;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date validade;

    public CNH() {
    }

    public CNH(String renach, String categoria, Date validade) {
        this.renach = renach;
        this.categoria = categoria;
        this.validade = validade;
    }

    public String getRenach() {
        return renach;
    }

    public void setRenach(String renach) {
        this.renach = renach;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    
}
