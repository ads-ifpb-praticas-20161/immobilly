/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.mbean;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Locacao;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ajp
 */
@Remote
public interface LocacaoFacadeRemote {

    void create(Locacao locacao);

    void edit(Locacao locacao);

    void remove(Locacao locacao);

    Locacao find(Object id);

    List<Locacao> findAll();

    List<Locacao> findRange(int[] range);

    int count();
    
}
