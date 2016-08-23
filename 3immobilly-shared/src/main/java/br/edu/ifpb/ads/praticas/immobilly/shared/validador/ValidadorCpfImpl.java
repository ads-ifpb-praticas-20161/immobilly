/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.validador;

import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoCpfException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aluísio
 */
public class ValidadorCpfImpl implements ValidadorCpf {

    @Override
    public Boolean ehValido(String cpf) throws InvalidoCpfException {
        if (cpf == null) {
            throw new InvalidoCpfException("CPF não foi informado!");
        }
        return validaCPF(cpf);
     
     /*   String pattern = "^\\d{3,3}.?\\d{3,3}.?\\d{3,3}-?\\d{1,2}";
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(cpf);
        return match.matches();
        */
    }

    /** 
     * Realiza o cálculo de digito verificador de CPF 
     */  

    private static String calcDigVerif(String num) {      
        Integer primDig, segDig;      
        int soma = 0, peso = 10;      
        for (int i = 0; i < num.length(); i++)      
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;      

        if (soma % 11 == 0 | soma % 11 == 1)      
            primDig = new Integer(0);      
        else      
            primDig = new Integer(11 - (soma % 11));      

        soma = 0;      
        peso = 11;      
        for (int i = 0; i < num.length(); i++)      
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;      

        soma += primDig.intValue() * 2;      
        if (soma % 11 == 0 | soma % 11 == 1)      
            segDig = new Integer(0);      
        else      
            segDig = new Integer(11 - (soma % 11));      

        return primDig.toString() + segDig.toString();      
    }      

    /** 
     * Valida cpf 
     * @return true se for válido, false se inválido 
     */  
    public static Boolean validaCPF(String CPF) {  


         CPF = CPF.replace(".", "");  
        CPF = CPF.replace("-", "");  
        if (CPF.length() != 11)      
            return false;   

        if (CPF.equals("00000000000") || CPF.equals("11111111111") ||  
        CPF.equals("22222222222") || CPF.equals("33333333333") ||  
        CPF.equals("44444444444") || CPF.equals("55555555555") ||  
        CPF.equals("66666666666") || CPF.equals("77777777777") ||  
        CPF.equals("88888888888") || CPF.equals("99999999999") ||  
       (CPF.length() != 11))  
       return(false);  


        String numDig = CPF.substring(0, 9);      
        return calcDigVerif(numDig).equals(CPF.substring(9, 11));      
    }  

}
