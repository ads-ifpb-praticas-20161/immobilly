/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco;

import java.io.Serializable;
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
@Table(name = "locacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locacao.findAll", query = "SELECT l FROM Locacao l"),
    @NamedQuery(name = "Locacao.findById", query = "SELECT l FROM Locacao l WHERE l.id = :id"),
    @NamedQuery(name = "Locacao.findByHorarioretorno", query = "SELECT l FROM Locacao l WHERE l.horarioretorno = :horarioretorno"),
    @NamedQuery(name = "Locacao.findByHorariosaida", query = "SELECT l FROM Locacao l WHERE l.horariosaida = :horariosaida"),
    @NamedQuery(name = "Locacao.findByKmretorno", query = "SELECT l FROM Locacao l WHERE l.kmretorno = :kmretorno"),
    @NamedQuery(name = "Locacao.findByKmsaida", query = "SELECT l FROM Locacao l WHERE l.kmsaida = :kmsaida")})
public class Locacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Column(name = "horarioretorno")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioretorno;
    @Column(name = "horariosaida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horariosaida;
    @Column(name = "kmretorno")
    private Integer kmretorno;
    @Column(name = "kmsaida")
    private Integer kmsaida;
    @JoinColumn(name = "colaborador_cod", referencedColumnName = "cod")
    @ManyToOne
    private Colaborador colaboradorCod;
    @JoinColumn(name = "veiculo_cod", referencedColumnName = "cod")
    @ManyToOne
    private Veiculo veiculoCod;

    public Locacao() {
    }

    public Locacao(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHorarioretorno() {
        return horarioretorno;
    }

    public void setHorarioretorno(Date horarioretorno) {
        this.horarioretorno = horarioretorno;
    }

    public Date getHorariosaida() {
        return horariosaida;
    }

    public void setHorariosaida(Date horariosaida) {
        this.horariosaida = horariosaida;
    }

    public Integer getKmretorno() {
        return kmretorno;
    }

    public void setKmretorno(Integer kmretorno) {
        this.kmretorno = kmretorno;
    }

    public Integer getKmsaida() {
        return kmsaida;
    }

    public void setKmsaida(Integer kmsaida) {
        this.kmsaida = kmsaida;
    }

    public Colaborador getColaboradorCod() {
        return colaboradorCod;
    }

    public void setColaboradorCod(Colaborador colaboradorCod) {
        this.colaboradorCod = colaboradorCod;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locacao)) {
            return false;
        }
        Locacao other = (Locacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Locacao[ id=" + id + " ]";
    }
    
}
