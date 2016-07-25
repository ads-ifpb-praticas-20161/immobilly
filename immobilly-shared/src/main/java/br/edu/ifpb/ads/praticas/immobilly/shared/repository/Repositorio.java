/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.repository;

import java.util.List;

/**
 *
 * @author jederson
 * @param <K>
 * @param <T>
 */
public interface Repositorio<T> {

    public boolean salvar(T t);

    public boolean remover(T t);    

    public T localizar(long key);

    public List<T> todos();
}
