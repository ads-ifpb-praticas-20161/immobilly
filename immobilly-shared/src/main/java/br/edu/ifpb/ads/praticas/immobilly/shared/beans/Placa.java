/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *
 * @author jederson
 */
@Embeddable
public class Placa {
    
    private String numeracao;
    private String cidade;
    private String uf;

    public Placa(String numeracao, String cidade, String uf) {
        this.numeracao = numeracao;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.numeracao);
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
        final Placa other = (Placa) obj;
        if (!Objects.equals(this.numeracao, other.numeracao)) {
            return false;
        }
        return true;
    }

    
    
    
}
