/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.services;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Veiculo;
import java.util.List;

/**
 *
 * @author Aluísio
 */
public interface ServiceVeiculo {

    public boolean salvar(Veiculo veiculo);

    public boolean excluir(Veiculo veiculo);

    public boolean atualizar(Veiculo veiculo);

    public Veiculo pesquisarVeiculo(Class<Veiculo> entidade, Object chave);

    public List<Veiculo> listarVeiculo();

}
