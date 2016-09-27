/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.serviceimpl;

import br.edu.ifpb.ads.praticas.immobilly.dao.VeiculoDao;
import br.edu.ifpb.ads.praticas.immobilly.entidades.Veiculo;
import br.edu.ifpb.ads.praticas.immobilly.service.ServiceVeiculo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServiceVeiculoImpl implements ServiceVeiculo {

    @EJB
    private VeiculoDao dao;

    @Override
    public boolean salvar(Veiculo veiculo) {
        return dao.salvar(veiculo);
    }

    @Override
    public boolean atualizar(Veiculo veiculo) {
        return dao.atualizar(veiculo);
    }

    @Override
    public boolean excluir(Veiculo veiculo) {
        return dao.excluir(veiculo);
    }

    @Override
    public Veiculo pesquisar(Class<Veiculo> entidade, Object key) {
        return dao.pesquisar(entidade, key);
    }

    @Override
    public List<Veiculo> listar() {
        return dao.listar();
    }
}
