package pl.filipwlodarczyk.NewApp;


import pl.filipwlodarczyk.NewApp.models.Client;

public class ClientService {

    private ClientRepository clientRepository = new ClientRepository();


    public Client createNewClient(String name, String nickname, int debit){
        return this.clientRepository.createClient(name, nickname, debit);
    }
}
