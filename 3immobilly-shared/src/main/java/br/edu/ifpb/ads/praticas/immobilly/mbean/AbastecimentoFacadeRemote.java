/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.mbean;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Abastecimento;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ajp
 */
@Remote
public interface AbastecimentoFacadeRemote {

    void create(Abastecimento abastecimento);

    void edit(Abastecimento abastecimento);

    void remove(Abastecimento abastecimento);

    Abastecimento find(Object id);

    List<Abastecimento> findAll();

    List<Abastecimento> findRange(int[] range);

    int count();
    
}
