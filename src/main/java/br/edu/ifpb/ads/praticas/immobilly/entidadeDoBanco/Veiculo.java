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
@Table(name = "veiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findByCod", query = "SELECT v FROM Veiculo v WHERE v.cod = :cod"),
    @NamedQuery(name = "Veiculo.findByAnofabricacao", query = "SELECT v FROM Veiculo v WHERE v.anofabricacao = :anofabricacao"),
    @NamedQuery(name = "Veiculo.findByCategoria", query = "SELECT v FROM Veiculo v WHERE v.categoria = :categoria"),
    @NamedQuery(name = "Veiculo.findByChassi", query = "SELECT v FROM Veiculo v WHERE v.chassi = :chassi"),
    @NamedQuery(name = "Veiculo.findByCombustivel", query = "SELECT v FROM Veiculo v WHERE v.combustivel = :combustivel"),
    @NamedQuery(name = "Veiculo.findByCor", query = "SELECT v FROM Veiculo v WHERE v.cor = :cor"),
    @NamedQuery(name = "Veiculo.findByFabricante", query = "SELECT v FROM Veiculo v WHERE v.fabricante = :fabricante"),
    @NamedQuery(name = "Veiculo.findByKm", query = "SELECT v FROM Veiculo v WHERE v.km = :km"),
    @NamedQuery(name = "Veiculo.findByModelo", query = "SELECT v FROM Veiculo v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Veiculo.findByRenavan", query = "SELECT v FROM Veiculo v WHERE v.renavan = :renavan"),
    @NamedQuery(name = "Veiculo.findByStatus", query = "SELECT v FROM Veiculo v WHERE v.status = :status")})
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod")
    private Long cod;
    @Column(name = "anofabricacao")
    @Temporal(TemporalType.DATE)
    private Date anofabricacao;
    @Size(max = 2147483647)
    @Column(name = "categoria")
    private String categoria;
    @Size(max = 2147483647)
    @Column(name = "chassi")
    private String chassi;
    @Size(max = 2147483647)
    @Column(name = "combustivel")
    private String combustivel;
    @Size(max = 2147483647)
    @Column(name = "cor")
    private String cor;
    @Size(max = 2147483647)
    @Column(name = "fabricante")
    private String fabricante;
    @Column(name = "km")
    private Integer km;
    @Size(max = 2147483647)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 2147483647)
    @Column(name = "renavan")
    private String renavan;
    @Size(max = 2147483647)
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "veiculoCod")
    private Collection<Locacao> locacaoCollection;
    @OneToMany(mappedBy = "veiculoCod")
    private Collection<Reserva> reservaCollection;
    @OneToMany(mappedBy = "veiculoCod")
    private Collection<Abastecimento> abastecimentoCollection;

    public Veiculo() {
    }

    public Veiculo(Long cod) {
        this.cod = cod;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public Date getAnofabricacao() {
        return anofabricacao;
    }

    public void setAnofabricacao(Date anofabricacao) {
        this.anofabricacao = anofabricacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @XmlTransient
    public Collection<Abastecimento> getAbastecimentoCollection() {
        return abastecimentoCollection;
    }

    public void setAbastecimentoCollection(Collection<Abastecimento> abastecimentoCollection) {
        this.abastecimentoCollection = abastecimentoCollection;
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
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.cod == null && other.cod != null) || (this.cod != null && !this.cod.equals(other.cod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Veiculo[ cod=" + cod + " ]";
    }
    
}
