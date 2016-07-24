/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoPlacaException;
import br.edu.ifpb.ads.praticas.immobilly.shared.validador.ValidadorNumPlaca;
import br.edu.ifpb.ads.praticas.immobilly.shared.validador.ValidadorNumPlacaImpl;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jederson
 */
@Table(name = "placa")
@Entity
public class Placa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "numeracao", nullable = false, unique = true, length = 8)
    private String numeracao;
    @Column(name = "cidade", nullable = false, length = 50)
    private String cidade;
    @Column(name = "uf", nullable = false, length = 50)
    private String uf;

    public Placa() {
    }

    public Placa(String numeracao, String cidade, String uf) throws InvalidoPlacaException {
        if (validarPlaca(numeracao)) {
            this.numeracao = numeracao;
        }
        this.cidade = cidade;
        this.uf = uf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean validarPlaca(String placa) throws InvalidoPlacaException {
        ValidadorNumPlaca verPlaca = new ValidadorNumPlacaImpl();
        return verPlaca.ehValido(placa);
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) throws InvalidoPlacaException {
        if (validarPlaca(numeracao)) {
            this.numeracao = numeracao;
        }
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
