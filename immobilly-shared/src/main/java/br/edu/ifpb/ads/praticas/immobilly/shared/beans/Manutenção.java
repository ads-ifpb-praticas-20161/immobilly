/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jederson
 */
@Entity
public class Manutenção {
    
    @EmbeddedId
    private ManutençãoId manutençãoId = new ManutençãoId();
    
    private Veiculo veiculo;
    
    private Fornecedor fornecedor;
    
    private String motivo;
    
    private String descrição;
    
    private BigDecimal valor;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp horarioInicial;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp horarioFinal;

    private Integer kmInicial;
    
    private Integer kmFinal;

    public Manutenção() {
    }
    
    
    
    
}
