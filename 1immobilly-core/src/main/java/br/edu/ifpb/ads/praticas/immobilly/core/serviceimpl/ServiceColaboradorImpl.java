/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.core.serviceimpl;

import br.edu.ifpb.ads.praticas.immobilly.core.dao.ColaboradorDao;
import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Colaborador;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.ServiceColaborador;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Aluísio
 */
@Stateless
@Remote(ServiceColaborador.class)
public class ServiceColaboradorImpl implements ServiceColaborador {

    @EJB
    private ColaboradorDao daoColaborador;

    @Override
    public boolean salvarColaborador(Colaborador colaborador) {
        return daoColaborador.salvarColaborador(colaborador);
    }

    @Override
    public boolean excluirColaborador(Colaborador administrador) {
        return daoColaborador.excluirColaborador(administrador);
    }

    @Override
    public boolean atualizarColaborador(Colaborador administrador) {
        return daoColaborador.atualizarColaborador(administrador);
    }

    @Override
    public Colaborador pesquisarColaborador(Class<Colaborador> entidade, Object chave) {
        return daoColaborador.pesquisarColaborador(entidade, chave);
    }

    @Override
    public List<Colaborador> listarColaborador() {
        return daoColaborador.listarColaborador();
    }

    @Override
    public Colaborador loginColaborador(String email, String senha) {
        return daoColaborador.loginColaborador(email, senha);
    }

}
