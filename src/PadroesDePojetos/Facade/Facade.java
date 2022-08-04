package PadroesDePojetos.Facade;

import PadroesDePojetos.subsistema1.crm.*;
import PadroesDePojetos.subsistema2.cep.*;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
