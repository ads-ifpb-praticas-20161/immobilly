//
// This file was generated by the JPA Modeler
//
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Abastecimento implements Serializable {

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Integer km;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date horario;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private BigDecimal valorAbastecimento;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private BigDecimal valorPorLitro;

    @EmbeddedId
    private AbastecimentoId abastecimentoId;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private int quantidade;

    public Abastecimento() {

    }

    public Integer getKm() {
        return this.km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Date getHorario() {
        return this.horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public BigDecimal getValorAbastecimento() {
        return this.valorAbastecimento;
    }

    public void setValorAbastecimento(BigDecimal valorAbastecimento) {
        this.valorAbastecimento = valorAbastecimento;
    }

    public BigDecimal getValorPorLitro() {
        return this.valorPorLitro;
    }

    public void setValorPorLitro(BigDecimal valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public AbastecimentoId getAbastecimentoId() {
        return this.abastecimentoId;
    }

    public void setAbastecimentoId(AbastecimentoId abastecimentoId) {
        this.abastecimentoId = abastecimentoId;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
