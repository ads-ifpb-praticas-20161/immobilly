/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.validador;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoPlacaException;
import br.edu.ifpb.ads.praticas.immobilly.shared.exception.ValidadorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorPlaca implements Validador<Placa> {

 
    @Override
    public boolean validar(Placa placa) {
        if(placa == null) {
            throw new ValidadorException("Placa não informada");
        }
        if(placa.getUf()== null){
            throw new ValidadorException("Placa Inválida: UF inexistente");
        }
        if(placa.getUf().length()!=2){
            throw new ValidadorException("Placa Inválida: UF Inválido");
        }
        if(placa.getCidade()== null){
            throw new ValidadorException("Placa Inválida: Cidade inexistente");
        }        
        String pattern = "[a-zA-Z]{3,3}-\\d{4,4}";
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(placa.getNumeracao());
        return match.matches();
    }

}
