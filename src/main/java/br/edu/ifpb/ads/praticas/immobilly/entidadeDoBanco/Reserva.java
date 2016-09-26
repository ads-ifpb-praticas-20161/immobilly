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
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findById", query = "SELECT r FROM Reserva r WHERE r.id = :id"),
    @NamedQuery(name = "Reserva.findByHorarioretorno", query = "SELECT r FROM Reserva r WHERE r.horarioretorno = :horarioretorno"),
    @NamedQuery(name = "Reserva.findByHorariosaida", query = "SELECT r FROM Reserva r WHERE r.horariosaida = :horariosaida"),
    @NamedQuery(name = "Reserva.findByStatus", query = "SELECT r FROM Reserva r WHERE r.status = :status")})
public class Reserva implements Serializable {

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
    @Column(name = "status")
    private Integer status;
    @JoinColumn(name = "colaborador_cod", referencedColumnName = "cod")
    @ManyToOne
    private Colaborador colaboradorCod;
    @JoinColumn(name = "veiculo_cod", referencedColumnName = "cod")
    @ManyToOne
    private Veiculo veiculoCod;

    public Reserva() {
    }

    public Reserva(Long id) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.ads.praticas.immobilly.entidadeDoBanco.Reserva[ id=" + id + " ]";
    }
    
}
