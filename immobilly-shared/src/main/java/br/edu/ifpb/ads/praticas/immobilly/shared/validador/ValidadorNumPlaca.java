/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.validador;

import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoPlacaException;

/**
 *
 * @author Aluísio
 */
public interface ValidadorNumPlaca {

    Boolean ehValido(String placa) throws InvalidoPlacaException;

}
