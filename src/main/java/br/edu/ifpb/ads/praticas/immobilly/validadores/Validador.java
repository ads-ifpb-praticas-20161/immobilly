/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.validadores;

/**
 *
 * @author jederson
 */
public interface Validador<T> {

    // Pode acontecer uma ValidadorException()
    public boolean validar(T t);
}
