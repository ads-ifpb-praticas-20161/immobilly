/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Placa;
import br.edu.ifpb.ads.praticas.immobilly.shared.exception.InvalidoPlacaException;
import br.edu.ifpb.ads.praticas.immobilly.shared.repository.RepositoryPlaca;
import br.edu.ifpb.ads.praticas.immobilly.shared.services.ServicePlaca;
import br.edu.ifpb.ads.praticas.immobilly.shared.validador.ValidadorPlaca;

/**
 *
 * @author jederson
 */
public class Loader {
    public static void main(String[] args) throws InvalidoPlacaException {
       Placa placa = new Placa("MNT-1034", "Cajazeiras", "PB");
        RepositoryPlaca repositoryPlaca = new RepositoryPlaca();
        ValidadorPlaca validadorPlaca = new ValidadorPlaca();
        ServicePlaca sp = new ServicePlaca(repositoryPlaca, validadorPlaca);
        
        sp.salvar(placa);
    }
}
