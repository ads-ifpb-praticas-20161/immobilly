/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.services;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Colaborador;
import java.util.List;

/**
 *
 * @author kaique
 */
public interface ServiceApp {

    public Colaborador login(String email, String senha);

    public List<Colaborador> listarPessoas();

}
