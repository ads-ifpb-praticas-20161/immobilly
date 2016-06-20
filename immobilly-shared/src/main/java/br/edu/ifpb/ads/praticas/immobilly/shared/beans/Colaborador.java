/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author jederson
 */
@Entity
public class Colaborador implements Serializable {
    
    @Id
    @GeneratedValue
    private long cod;
    private String nome;
    private String email;
    private String senha;
    private String celular;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    private String sexo;
    private String CPF;
    private String cargo;
    @Embedded
    private Endereço endereco;
    @Embedded
    private CNH cnh;
    @OneToOne(mappedBy = "colaborador",cascade = CascadeType.ALL)
    private Locacao locacao;
    @OneToOne(mappedBy = "colaborador", cascade = CascadeType.ALL)
    private Reserva reserva;
    @OneToMany(mappedBy = "colaborador", cascade = CascadeType.ALL)
    private Licenciamento licenciamento;
}
