package facade;

import facade.subsystem1.CrmService;
import facade.subsystem2.CepApi;

public class Facade {

    public void migrateClient(String name, String cep) {
        String state = CepApi.getInstance().retrieveState(cep);
        String city = CepApi.getInstance().retrieveCity(cep);
        CrmService.saveClient(name, cep, state, city);
    }

}
