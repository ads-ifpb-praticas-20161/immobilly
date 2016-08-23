/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author jederson
 */
@Embeddable
public class LicenciamentoId implements Serializable {
    
    //@OneToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private Colaborador supervisor;
    
    //@OneToOne
    private Veiculo veiculo;

    public LicenciamentoId() {
    }

    public LicenciamentoId(Colaborador supervisor, Veiculo veiculo) {
        this.supervisor = supervisor;
        this.veiculo = veiculo;
    }

    public Colaborador getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Colaborador supervisor) {
        this.supervisor = supervisor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LicenciamentoId other = (LicenciamentoId) obj;
        if (!Objects.equals(this.supervisor, other.supervisor)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        return true;
    }
    
    
}
