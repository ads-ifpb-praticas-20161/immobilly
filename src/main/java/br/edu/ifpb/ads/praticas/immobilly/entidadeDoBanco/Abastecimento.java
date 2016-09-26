/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aluísio
 */
@Entity
@Table(name = "abastecimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abastecimento.findAll", query = "SELECT a FROM Abastecimento a"),
    @NamedQuery(name = "Abastecimento.findByAbastecimentoid", query = "SELECT a FROM Abastecimento a WHERE a.abastecimentoid = :abastecimentoid"),
    @NamedQuery(name = "Abastecimento.findByHorario", query = "SELECT a FROM Abastecimento a WHERE a.horario = :horario"),
    @NamedQuery(name = "Abastecimento.findByKm", query = "SELECT a FROM Abastecimento a WHERE a.km = :km"),
    @NamedQuery(name = "Abastecimento.findByQuantidade", query = "SELECT a FROM Abastecimento a WHERE a.quantidade = :quantidade"),
    @NamedQuery(name = "Abastecimento.findByValorabastecimento", query = "SELECT a FROM Abastecimento a WHERE a.valorabastecimento = :valorabastecimento"),
    @NamedQuery(name = "Abastecimento.findByValorporlitro", query = "SELECT a FROM Abastecimento a WHERE a.valorporlitro = :valorporlitro")})
public class Abastecimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "abastecimentoid")
    private Long abastecimentoid;
    @Column(name = "horario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horario;
    @Column(name = "km")
    private Integer km;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "valorabastecimento")
    private BigInteger valorabastecimento;
    @Column(name = "valorporlitro")
    private BigInteger valorporlitro;
    @JoinColumn(name = "fornecedor_cod", referencedColumnName = "cod")
    @ManyToOne
    private Fornecedor fornecedorCod;
    @JoinColumn(name = "veiculo_cod", referencedColumnName = "cod")
    @ManyToOne
    private Veiculo veiculoCod;

    public Abastecimento() {
    }

    public Abastecimento(Long abastecimentoid) {
        this.abastecimentoid = abastecimentoid;
    }

    public Long getAbastecimentoid() {
        return abastecimentoid;
    }

    public void setAbastecimentoid(Long abastecimentoid) {
        this.abastecimentoid = abastecimentoid;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigInteger getValorabastecimento() {
        return valorabastecimento;
    }

    public void setValorabastecimento(BigInteger valorabastecimento) {
        this.valorabastecimento = valorabastecimento;
    }

    public BigInteger getValorporlitro() {
        return valorporlitro;
    }

    public void setValorporlitro(BigInteger valorporlitro) {
        this.valorporlitro = valorporlitro;
    }

    public Fornecedor getFornecedorCod() {
        return fornecedorCod;
    }

    public void setFornecedorCod(Fornecedor fornecedorCod) {
        this.fornecedorCod = fornecedorCod;
    }

    public Veiculo getVeiculoCod() {
        return veiculoCod;
    }

    public void setVeiculoCod(Veiculo veiculoCod) {
        this.veiculoCod = veiculoCod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (abastecimentoid != null ? abastecimentoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abastecimento)) {
            return false;
        }
        Abastecimento other = (Abastecimento) object;
        if ((this.abastecimentoid == null && other.abastecimentoid != null) || (this.abastecimentoid != null && !this.abastecimentoid.equals(other.abastecimentoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Abastecimento[ abastecimentoid=" + abastecimentoid + " ]";
    }
    
}
