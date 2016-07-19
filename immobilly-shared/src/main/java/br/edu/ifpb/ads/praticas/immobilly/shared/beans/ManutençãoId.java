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
import javax.persistence.ManyToOne;

/**
 *
 * @author jederson
 */
@Embeddable
public class ManutençãoId implements Serializable {
    
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private Fornecedor fornecedor;
    
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private Veiculo veiculo;

    public ManutençãoId() {
    }

    public ManutençãoId(Fornecedor fornecedor, Veiculo veiculo) {
        this.fornecedor = fornecedor;
        this.veiculo = veiculo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
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
        hash = 17 * hash + Objects.hashCode(this.fornecedor);
        hash = 17 * hash + Objects.hashCode(this.veiculo);
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
        final ManutençãoId other = (ManutençãoId) obj;
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        return true;
    }
    
    

}
