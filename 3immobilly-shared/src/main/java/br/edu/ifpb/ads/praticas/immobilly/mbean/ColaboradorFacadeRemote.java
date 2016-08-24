/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.mbean;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Colaborador;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ajp
 */
@Remote
public interface ColaboradorFacadeRemote {

    void create(Colaborador colaborador);

    void edit(Colaborador colaborador);

    void remove(Colaborador colaborador);

    Colaborador find(Object id);

    List<Colaborador> findAll();

    List<Colaborador> findRange(int[] range);

    int count();
    
}
