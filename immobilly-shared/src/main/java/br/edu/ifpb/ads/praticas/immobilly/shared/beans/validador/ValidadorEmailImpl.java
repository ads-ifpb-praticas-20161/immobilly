/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.beans.validador;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.exception.InvalidoEmailException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aluísio
 */
public class ValidadorEmailImpl implements ValidadorEmail {

    @Override
    public Boolean ehValido(String email) throws InvalidoEmailException {
        if (email == null) {
            throw new InvalidoEmailException("Email não foi informado!");
        }
        String pattern = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
                + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
                + "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(email);
        return match.matches();
    }

}
