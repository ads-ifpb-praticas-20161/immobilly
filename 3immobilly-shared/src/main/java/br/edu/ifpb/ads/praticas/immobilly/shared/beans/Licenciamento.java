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

/**
 *
 * @author jederson
 */

@Entity
public class Licenciamento implements Serializable {
    
    @EmbeddedId
    private LicenciamentoId licenciamentoId = new LicenciamentoId();
    private Date data;
    private Date anoReferencia;
    private BigDecimal valor;
}
