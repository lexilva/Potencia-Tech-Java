package facade;

import subsistema2cep.CepApi;
import subsistemacrm.CrmService;

public class Facade {

    public void migraCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade( cep );
        String estado = CepApi.getInstancia().recuperaEstado( cep );
        CrmService.gravarCliente( nome, cep, cidade, estado );
    }
}
