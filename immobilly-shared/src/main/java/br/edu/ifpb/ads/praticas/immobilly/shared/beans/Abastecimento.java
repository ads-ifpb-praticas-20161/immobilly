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
}
