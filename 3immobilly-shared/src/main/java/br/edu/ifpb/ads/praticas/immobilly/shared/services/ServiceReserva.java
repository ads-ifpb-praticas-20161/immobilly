/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.immobilly.shared.services;

import br.edu.ifpb.ads.praticas.immobilly.shared.beans.Reserva;
import java.util.List;

/**
 *
 * @author Aluísio
 */
public interface ServiceReserva {

    public boolean salvarReserva(Reserva reserva);

    public boolean excluirReserva(Reserva reserva);

    public boolean atualizarReserva(Reserva reserva);

    public Reserva pesquisarReserva(Class<Reserva> entidade, Object chave);

    public List<Reserva> listarReserva();

}
