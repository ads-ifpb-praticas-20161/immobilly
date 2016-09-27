package br.edu.ifpb.ads.praticas.immobilly.entidadesnusada;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.ws.rs.FormParam;

/**
 * @author aluisio
 */
@Entity
public class Fornecedor implements Serializable {

    @Id
    @FormParam("cod")
    @GeneratedValue
    private long cod;

    @Basic
    @FormParam("razaoSocial")
    private String razaoSocial;

    @Basic
    @FormParam("nomeFantasia")
    private String nomeFantasia;

    @Basic
    @FormParam("email")
    private String email;

    @Basic
    @FormParam("telefone")
    private String telefone;

    @Embedded
    private Endereco endereco;

    public Fornecedor() {
    }

    public Fornecedor(String razaoSocial, String nomeFantasia, String email, String telefone, Endereco endereco) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Fornecedor(long cod, String razaoSocial, String nomeFantasia, String email, String telefone, Endereco endereco) {
        this.cod = cod;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    

    public long getCod() {
        return this.cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (this.cod ^ (this.cod >>> 32));
        hash = 37 * hash + Objects.hashCode(this.razaoSocial);
        hash = 37 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.telefone);
        hash = 37 * hash + Objects.hashCode(this.endereco);
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.razaoSocial, other.razaoSocial)) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }
    

}
