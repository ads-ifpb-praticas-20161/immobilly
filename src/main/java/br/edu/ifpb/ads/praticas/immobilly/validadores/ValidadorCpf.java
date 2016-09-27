/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.validadores;

import br.edu.ifpb.ads.praticas.immobilly.exception.InvalidoCpfException;

/**
 *
 * @author Aluísio
 */
public interface ValidadorCpf {

    Boolean ehValido(String email) throws InvalidoCpfException;

}
