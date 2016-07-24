/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans.validador;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.exception.InvalidoEmailException;
import br.edu.ifpb.ads.praticas.immobilly.shared.beans.exception.InvalidoPlacaException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorPlacaImpl implements ValidadorPlaca {

    @Override
    public Boolean ehValido(String placa) throws InvalidoPlacaException {
        if (placa == null) {
            throw new InvalidoPlacaException("Plana não foi informado!");
        }
        String pattern = "[a-zA-Z]{3,3}-\\d{4,4}";
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(placa);
        return match.matches();

    }

}
