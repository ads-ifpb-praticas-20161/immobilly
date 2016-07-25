/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.services;

import java.util.List;

/**
 *
 * @author jederson
 */
public interface Service<K, T> {

    /*Pode acontecer uma ValidadorException()
     Pode acontecer uma ServiceException() */    
    public boolean salvar(T t);

    public boolean remover(T t);

    public T localizar(K key);

    public List<T> todos();
}
