/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.services;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import br.edu.ifpb.ads.praticas.immobilly.shared.repository.RepositoryPlaca;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.Service;
import br.edu.ifpb.ads.praticas.immobilly.shared.validador.Validador;
import java.util.List;

/**
 *
 * @author jederson
 */
public class ServicePlaca implements Service<Integer, Placa> {

    RepositoryPlaca repositoryPlaca;
    Validador<Placa> validadorPlaca;

    public ServicePlaca(RepositoryPlaca repositoryPlaca, Validador<Placa> validadorPlaca) {
        this.repositoryPlaca = repositoryPlaca;
        this.validadorPlaca = validadorPlaca;
    }
    
    
    
    @Override
    public boolean salvar(Placa placa) {
        if(validadorPlaca.validar(placa)){
            return repositoryPlaca.salvar(placa);
        }
        return false;
    }

    @Override
    public boolean remover(Placa placa) {
        if(validadorPlaca.validar(placa)){
            return repositoryPlaca.salvar(placa);
        }
        return false;
    }

    @Override
    public Placa localizar(Integer id) {
        return repositoryPlaca.localizar(id);
    }

    @Override
    public List<Placa> todos() {
        return repositoryPlaca.todos();
    }
    
}
