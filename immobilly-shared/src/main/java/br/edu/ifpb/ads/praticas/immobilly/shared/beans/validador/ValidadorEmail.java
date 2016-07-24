/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans.validador;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.exception.InvalidoEmailException;

/**
 *
 * @author Aluísio
 */
public interface ValidadorEmail {

    Boolean ehValido(String email) throws InvalidoEmailException;
}
