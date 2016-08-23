/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.dao;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import java.util.List;

/**
 *
 * @author Aluísio
 */
public interface PlacaDaoIf {
    
    public void salvar(Placa p);

    public void atualizar(Placa p);

    public Placa buscar(int id);

    public List<Placa> listarTodos();
    
    public void excluir (int id);
    
}
