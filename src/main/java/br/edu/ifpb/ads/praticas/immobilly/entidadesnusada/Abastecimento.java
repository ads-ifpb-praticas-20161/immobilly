//
// This file was generated by the JPA Modeler
//
package br.edu.ifpb.ads.praticas.immobilly.entidadesnusada;

import br.edu.ifpb.ads.praticas.immobilly.entidades.Veiculo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.ws.rs.FormParam;

/**
 * @author aluisio
 */
@Entity
public class Abastecimento implements Serializable {

    @Id
    @GeneratedValue
    private long abastecimentoId;
    @OneToOne(cascade = {CascadeType.ALL}, targetEntity = Fornecedor.class)
    private Colaborador fornecedor;

    @OneToOne(cascade = {CascadeType.ALL}, targetEntity = Veiculo.class)
    private Veiculo veiculo;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @FormParam("horario")
    private Date horario;

    @Basic
    @FormParam("km")
    private Integer km;

    @Basic
    @FormParam("valorPorLitro")
    private BigDecimal valorPorLitro;

    @Basic
    @FormParam("valorAbastecimento")
    private BigDecimal valorAbastecimento;

    @Basic
    @FormParam("quantidade")
    private int quantidade;

    public Abastecimento() {
    }

    public Abastecimento(Colaborador fornecedor, Veiculo veiculo, Date horario, Integer km, BigDecimal valorPorLitro, BigDecimal valorAbastecimento, int quantidade) {
        this.fornecedor = fornecedor;
        this.veiculo = veiculo;
        this.horario = horario;
        this.km = km;
        this.valorPorLitro = valorPorLitro;
        this.valorAbastecimento = valorAbastecimento;
        this.quantidade = quantidade;
    }

    public Abastecimento(long abastecimentoId, Colaborador fornecedor, Veiculo veiculo, Date horario, Integer km, BigDecimal valorPorLitro, BigDecimal valorAbastecimento, int quantidade) {
        this.abastecimentoId = abastecimentoId;
        this.fornecedor = fornecedor;
        this.veiculo = veiculo;
        this.horario = horario;
        this.km = km;
        this.valorPorLitro = valorPorLitro;
        this.valorAbastecimento = valorAbastecimento;
        this.quantidade = quantidade;
    }

    public long getAbastecimentoId() {
        return abastecimentoId;
    }

    public void setAbastecimentoId(long abastecimentoId) {
        this.abastecimentoId = abastecimentoId;
    }

    public Colaborador getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Colaborador fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getHorario() {
        return this.horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Integer getKm() {
        return this.km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public BigDecimal getValorPorLitro() {
        return this.valorPorLitro;
    }

    public void setValorPorLitro(BigDecimal valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public BigDecimal getValorAbastecimento() {
        return this.valorAbastecimento;
    }

    public void setValorAbastecimento(BigDecimal valorAbastecimento) {
        this.valorAbastecimento = valorAbastecimento;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.abastecimentoId ^ (this.abastecimentoId >>> 32));
        hash = 97 * hash + Objects.hashCode(this.fornecedor);
        hash = 97 * hash + Objects.hashCode(this.veiculo);
        hash = 97 * hash + Objects.hashCode(this.horario);
        hash = 97 * hash + Objects.hashCode(this.km);
        hash = 97 * hash + Objects.hashCode(this.valorPorLitro);
        hash = 97 * hash + Objects.hashCode(this.valorAbastecimento);
        hash = 97 * hash + this.quantidade;
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
        final Abastecimento other = (Abastecimento) obj;
        if (this.abastecimentoId != other.abastecimentoId) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.km, other.km)) {
            return false;
        }
        if (!Objects.equals(this.valorPorLitro, other.valorPorLitro)) {
            return false;
        }
        if (!Objects.equals(this.valorAbastecimento, other.valorAbastecimento)) {
            return false;
        }
        return true;
    }

}
