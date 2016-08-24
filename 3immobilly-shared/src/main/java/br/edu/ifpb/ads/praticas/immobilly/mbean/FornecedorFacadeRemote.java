/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.mbean;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Fornecedor;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ajp
 */
@Remote
public interface FornecedorFacadeRemote {

    void create(Fornecedor fornecedor);

    void edit(Fornecedor fornecedor);

    void remove(Fornecedor fornecedor);

    Fornecedor find(Object id);

    List<Fornecedor> findAll();

    List<Fornecedor> findRange(int[] range);

    int count();
    
}
