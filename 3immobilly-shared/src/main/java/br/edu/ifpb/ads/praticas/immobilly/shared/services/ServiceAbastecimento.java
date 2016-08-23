/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.services;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Abastecimento;
import java.util.List;

/**
 *
 * @author Izabel Silva
 */
public interface ServiceAbastecimento {

    public boolean salvar(Abastecimento pessoa);

    public boolean excluir(Abastecimento pessoa);

    public boolean atualizar(Abastecimento pessoa);

    public Abastecimento pesquisar(Class<Abastecimento> entidade, Object chave);

    public List<Abastecimento> listarAbastecimento();
}
