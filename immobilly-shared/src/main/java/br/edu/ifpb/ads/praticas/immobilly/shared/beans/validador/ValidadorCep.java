/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans.validador;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.exception.InvalidoCepException;

/**
 *
 * @author Aluísio
 */
public interface ValidadorCep {
     Boolean ehValido(String cep) throws InvalidoCepException;
    
}
