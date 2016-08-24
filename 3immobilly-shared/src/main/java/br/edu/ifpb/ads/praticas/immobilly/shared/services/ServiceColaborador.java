/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.services;


import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Colaborador;
import java.util.List;

/**
 *
 * @author Aluísio
 */
public interface ServiceColaborador {
    public boolean salvarColaborador(Colaborador colaborador);
    public boolean excluirColaborador(Colaborador colaborador);
    public boolean atualizarColaborador(Colaborador colaborador);
    public Colaborador pesquisarColaborador(Class<Colaborador> entidade, Object chave);
    public List<Colaborador> listarColaborador();
    public Colaborador loginColaborador(String email, String senha);       
}
