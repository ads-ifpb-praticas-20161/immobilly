package br.edu.ifpb.ads.praticas.immobilly.shared.services;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Veiculo;
import br.edu.ifpb.ads.praticas.immobilly.shared.repository.RepositoryVeiculo;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.Service;

import java.util.List;

/**
 * Created by jederson on 21/08/16.
 */
public class ServiceVeiculo implements Service<Integer,Veiculo> {

    private RepositoryVeiculo rv;

    @Override
    public boolean salvar(Veiculo veiculo) {
        return rv.salvar(veiculo);
    }

    @Override
    public boolean remover(Veiculo veiculo) {
        return rv.remover(veiculo);
    }

    @Override
    public Veiculo localizar(Integer key) {
        return rv.localizar(key);
    }

    @Override
    public List<Veiculo> todos() {
        return rv.todos();
    }
}
