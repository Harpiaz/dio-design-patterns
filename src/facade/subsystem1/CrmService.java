package facade.subsystem1;

public class CrmService {

    private CrmService() {
    }

    public static void saveClient(String name, String cep, String state, String city) {
        System.out.println("Client saved in CRM system: " + name + ", " + cep);
    }

}
