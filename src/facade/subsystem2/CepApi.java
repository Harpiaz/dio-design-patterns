package facade.subsystem2;

public class CepApi {
    
    private static CepApi instance = new CepApi();;

    private CepApi() {
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String retrieveCity(String cep) {
        return "Recife";
    }

    public String retrieveState(String cep) {
        return "Pernambuco";
    }

}
