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
public class Locacao implements Serializable{
    
    @Id
    @GeneratedValue
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Colaborador colaborador;
    @OneToOne(cascade = CascadeType.ALL)
    private Veiculo veiculo;
    private Integer kmRetorno;
    private Integer kmSaida;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horarioSaida;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horarioRetorno;

    public Locacao() {
    }

    public Locacao(long id, Colaborador colaborador, Veiculo veiculo, Integer kmSaida, Date horarioSaida) {
        this.id = id;
        this.colaborador = colaborador;
        this.veiculo = veiculo;
        this.kmSaida = kmSaida;
        this.horarioSaida = horarioSaida;
    }

    public Locacao(long id, Colaborador colaborador, Veiculo veiculo, Integer kmRetorno, Integer kmSaida, Date horarioSaida, Date horarioRetorno) {
        this.id = id;
        this.colaborador = colaborador;
        this.veiculo = veiculo;
        this.kmRetorno = kmRetorno;
        this.kmSaida = kmSaida;
        this.horarioSaida = horarioSaida;
        this.horarioRetorno = horarioRetorno;
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

    public Integer getKmRetorno() {
        return kmRetorno;
    }

    public void setKmRetorno(Integer kmRetorno) {
        this.kmRetorno = kmRetorno;
    }

    public Integer getKmSaida() {
        return kmSaida;
    }

    public void setKmSaida(Integer kmSaida) {
        this.kmSaida = kmSaida;
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

    public void realizarLocacao(){
        
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Locacao other = (Locacao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
