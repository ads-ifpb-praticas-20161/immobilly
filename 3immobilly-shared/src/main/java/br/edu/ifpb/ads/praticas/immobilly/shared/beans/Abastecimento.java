/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jederson
 */
@Entity
public class Abastecimento implements Serializable {
    
    @EmbeddedId
    private AbastecimentoId abastecimentoId = new AbastecimentoId();
    
    private Veiculo veiculo;
    
    private Fornecedor fornecedor;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horario;
    
    private Integer km;
    
    private BigDecimal valorPorLitro;
    
    private BigDecimal valorAbastecimento;
    
    private int quantidade;

    public Abastecimento() {
    }

    public Abastecimento(Veiculo veiculo, Fornecedor fornecedor, Date horario, Integer km, BigDecimal valorPorLitro, BigDecimal valorAbastecimento, int quantidade) {
        this.veiculo = veiculo;
        this.fornecedor = fornecedor;
        this.horario = horario;
        this.km = km;
        this.valorPorLitro = valorPorLitro;
        this.valorAbastecimento = valorAbastecimento;
        this.quantidade = quantidade;
    }

    public AbastecimentoId getAbastecimentoId() {
        return abastecimentoId;
    }

    public void setAbastecimentoId(AbastecimentoId abastecimentoId) {
        this.abastecimentoId = abastecimentoId;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
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

    public BigDecimal getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(BigDecimal valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public BigDecimal getValorAbastecimento() {
        return valorAbastecimento;
    }

    public void setValorAbastecimento(BigDecimal valorAbastecimento) {
        this.valorAbastecimento = valorAbastecimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
