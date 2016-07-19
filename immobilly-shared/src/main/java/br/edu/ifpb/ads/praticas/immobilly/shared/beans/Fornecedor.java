/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author jederson
 */
class Fornecedor {
    
    @Id
    @GeneratedValue
    private long cod;
    private String razaoSocial;
    private String nomeFantasia;
    private String email;
    private String telefone;
    @Enumerated(EnumType.STRING)
    private CatType categoria;
    private String CNPJ;
    @Embedded
    private Endereço endereco;
    @OneToOne(mappedBy = "fornecedor",cascade = CascadeType.ALL)
    private Manutenção manutencao;
    @OneToOne(mappedBy = "fornecedor", cascade = CascadeType.ALL)
    private Abastecimento abastecimento;

    public Fornecedor() {
    }

    public Fornecedor(long cod, String razaoSocial, String nomeFantasia, String email, String telefone, CatType categoria, String CNPJ, Endereço endereco, Manutenção manutencao, Abastecimento abastecimento) {
        this.cod = cod;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.telefone = telefone;
        this.categoria = categoria;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.manutencao = manutencao;
        this.abastecimento = abastecimento;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public CatType getCategoria() {
        return categoria;
    }

    public void setCategoria(CatType categoria) {
        this.categoria = categoria;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public Manutenção getManutencao() {
        return manutencao;
    }

    public void setManutencao(Manutenção manutencao) {
        this.manutencao = manutencao;
    }

    public Abastecimento getAbastecimento() {
        return abastecimento;
    }

    public void setAbastecimento(Abastecimento abastecimento) {
        this.abastecimento = abastecimento;
    }
    
    
}
