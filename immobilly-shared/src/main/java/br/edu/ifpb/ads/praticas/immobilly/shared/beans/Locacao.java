/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
}
