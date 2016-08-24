/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author jederson
 */
@Entity
public class Reserva implements Serializable{
    
    @Id
    @GeneratedValue
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Colaborador colaborador;
    @OneToOne(cascade = CascadeType.ALL)
    private Veiculo veiculo;    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horarioSaida;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horarioRetorno;
    private int status;

    public Reserva() {
    }

    public Reserva(long id, Colaborador colaborador, Veiculo veiculo, Date horarioSaida, Date horarioRetorno, int status) {
        this.id = id;
        this.colaborador = colaborador;
        this.veiculo = veiculo;
        this.horarioSaida = horarioSaida;
        this.horarioRetorno = horarioRetorno;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(Date horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public Date getHorarioRetorno() {
        return horarioRetorno;
    }

    public void setHorarioRetorno(Date horarioRetorno) {
        this.horarioRetorno = horarioRetorno;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Reserva other = (Reserva) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    
}
