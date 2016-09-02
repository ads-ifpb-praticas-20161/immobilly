/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.mbean;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Veiculo;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ajp
 */
@Remote
public interface VeiculoFacadeRemote {

    void create(Veiculo veiculo);

    void edit(Veiculo veiculo);

    void remove(Veiculo veiculo);

    Veiculo find(Object id);

    List<Veiculo> findAll();

    List<Veiculo> findRange(int[] range);

    int count();
    
}
