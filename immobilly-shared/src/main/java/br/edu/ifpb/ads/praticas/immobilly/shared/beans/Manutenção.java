/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author jederson
 */
@Entity
public class Manutenção {
    
    @EmbeddedId
    private ManutençãoId manutençãoId;
}
