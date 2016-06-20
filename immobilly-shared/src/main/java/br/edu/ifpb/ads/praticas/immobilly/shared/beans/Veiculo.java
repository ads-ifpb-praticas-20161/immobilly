/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author jederson
 */
@Entity
public class Veiculo  implements Serializable{
    
    @Id
    @GeneratedValue
    private long cod;
    private String modelo;
    private String fabricante;
    private String cor;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date anoFabricacao;
    private String chassi;
    private String renavan;
    private String categoria;
    private String combustivel;
    @Embedded
    private Placa placa;
    private Integer km;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Veiculo() {
        this.status = Status.DISPONIVEL; 
    }

    public Veiculo(long cod, String modelo, String fabricante, String cor, Date anoFabricacao, String chassi, String renavan, String categoria, String combustivel, Placa placa, Integer km) {
        this.cod = cod;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.chassi = chassi;
        this.renavan = renavan;
        this.categoria = categoria;
        this.combustivel = combustivel;
        this.placa = placa;
        this.km = km;
        this.status = Status.DISPONIVEL;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.cod ^ (this.cod >>> 32));
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
        final Veiculo other = (Veiculo) obj;
        if (this.cod != other.cod) {
            return false;
        }
        return true;
    }
    
    
}
