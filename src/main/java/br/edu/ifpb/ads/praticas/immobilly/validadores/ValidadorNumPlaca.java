/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.validadores;

import br.edu.ifpb.ads.praticas.immobilly.exception.InvalidoPlacaException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jederson
 */
public class ValidadorNumPlaca {
   
    public Boolean ehValido(String placa) throws InvalidoPlacaException {
        if (placa == null) {
            throw new InvalidoPlacaException("Numeração da Placa Inválida!");
        }
        String pattern = "[a-zA-Z]{3,3}-\\d{4,4}";
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(placa);
        return match.matches();

    }
}
