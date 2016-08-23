/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.validador;

import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoCepException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCepImpl implements ValidadorCep {

    @Override
    public Boolean ehValido(String cep) throws InvalidoCepException {
        if (cep == null) {
            throw new InvalidoCepException("Cep não foi informado!");
        }
        String pattern = "^\\d{5,5}-?\\d{3,3}$";
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(cep);
        return match.matches();
    }

}
