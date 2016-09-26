/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Aluísio
 */
@Entity
@Table(name = "colaborador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colaborador.findAll", query = "SELECT c FROM Colaborador c"),
    @NamedQuery(name = "Colaborador.findByCod", query = "SELECT c FROM Colaborador c WHERE c.cod = :cod"),
    @NamedQuery(name = "Colaborador.findByCargo", query = "SELECT c FROM Colaborador c WHERE c.cargo = :cargo"),
    @NamedQuery(name = "Colaborador.findByCelular", query = "SELECT c FROM Colaborador c WHERE c.celular = :celular"),
    @NamedQuery(name = "Colaborador.findByDatanascimento", query = "SELECT c FROM Colaborador c WHERE c.datanascimento = :datanascimento"),
    @NamedQuery(name = "Colaborador.findByEmail", query = "SELECT c FROM Colaborador c WHERE c.email = :email"),
    @NamedQuery(name = "Colaborador.findByNome", query = "SELECT c FROM Colaborador c WHERE c.nome = :nome"),
    @NamedQuery(name = "Colaborador.findBySenha", query = "SELECT c FROM Colaborador c WHERE c.senha = :senha"),
    @NamedQuery(name = "Colaborador.findBySexo", query = "SELECT c FROM Colaborador c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "Colaborador.findByCategoria", query = "SELECT c FROM Colaborador c WHERE c.categoria = :categoria"),
    @NamedQuery(name = "Colaborador.findByRenach", query = "SELECT c FROM Colaborador c WHERE c.renach = :renach"),
    @NamedQuery(name = "Colaborador.findByValidade", query = "SELECT c FROM Colaborador c WHERE c.validade = :validade"),
    @NamedQuery(name = "Colaborador.findByBairro", query = "SELECT c FROM Colaborador c WHERE c.bairro = :bairro"),
    @NamedQuery(name = "Colaborador.findByCep", query = "SELECT c FROM Colaborador c WHERE c.cep = :cep"),
    @NamedQuery(name = "Colaborador.findByCidade", query = "SELECT c FROM Colaborador c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Colaborador.findByNumero", query = "SELECT c FROM Colaborador c WHERE c.numero = :numero"),
    @NamedQuery(name = "Colaborador.findByRua", query = "SELECT c FROM Colaborador c WHERE c.rua = :rua"),
    @NamedQuery(name = "Colaborador.findByUf", query = "SELECT c FROM Colaborador c WHERE c.uf = :uf")})
public class Colaborador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod")
    private Long cod;
    @Size(max = 2147483647)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 2147483647)
    @Column(name = "celular")
    private String celular;
    @Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "email")
    private String email;
    @Size(max = 2147483647)
    @Column(name = "nome")
    private String nome;
    @Size(max = 2147483647)
    @Column(name = "senha")
    private String senha;
    @Size(max = 2147483647)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 2147483647)
    @Column(name = "categoria")
    private String categoria;
    @Size(max = 2147483647)
    @Column(name = "renach")
    private String renach;
    @Column(name = "validade")
    @Temporal(TemporalType.DATE)
    private Date validade;
    @Size(max = 2147483647)
    @Column(name = "bairro")
    private String bairro;
    @Size(max = 2147483647)
    @Column(name = "cep")
    private String cep;
    @Size(max = 2147483647)
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "numero")
    private Integer numero;
    @Size(max = 2147483647)
    @Column(name = "rua")
    private String rua;
    @Size(max = 2147483647)
    @Column(name = "uf")
    private String uf;
    @OneToMany(mappedBy = "colaboradorCod")
    private Collection<Locacao> locacaoCollection;
    @OneToMany(mappedBy = "colaboradorCod")
    private Collection<Reserva> reservaCollection;

    public Colaborador() {
    }

    public Colaborador(Long cod) {
        this.cod = cod;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRenach() {
        return renach;
    }

    public void setRenach(String renach) {
        this.renach = renach;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @XmlTransient
    public Collection<Locacao> getLocacaoCollection() {
        return locacaoCollection;
    }

    public void setLocacaoCollection(Collection<Locacao> locacaoCollection) {
        this.locacaoCollection = locacaoCollection;
    }

    @XmlTransient
    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod != null ? cod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colaborador)) {
            return false;
        }
        Colaborador other = (Colaborador) object;
        if ((this.cod == null && other.cod != null) || (this.cod != null && !this.cod.equals(other.cod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Colaborador[ cod=" + cod + " ]";
    }
    
}
