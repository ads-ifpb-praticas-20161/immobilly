//
// This file was generated by the JPA Modeler
//
package br.edu.ifpb.ads.praticas.immobilly.entidadesnusada;

import br.edu.ifpb.ads.praticas.immobilly.enums.CatType;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author aluisio
 */
@Embeddable
public class CNH implements Serializable {

    @Basic
    private String renach;

    @Basic
    @Enumerated(EnumType.STRING)
    private CatType categoria;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date validade;

    public String getRenach() {
        return this.renach;
    }

    public void setRenach(String renach) {
        this.renach = renach;
    }

    public CatType getCategoria() {
        return categoria;
    }

    public void setCategoria(CatType categoria) {
        this.categoria = categoria;
    }

    public Date getValidade() {
        return this.validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

}
