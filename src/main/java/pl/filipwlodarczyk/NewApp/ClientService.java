package pl.filipwlodarczyk.NewApp;


import pl.filipwlodarczyk.NewApp.models.Client;

import java.util.List;

public class ClientService {

    private ClientRepository clientRepository = new ClientRepository();
    private Client client;


    public Client createNewClient(String name, String nickname, int debit){
        return this.clientRepository.createClient(name, nickname, debit);
    }

    public void showClients(){
        this.clientRepository.getClientList();
    }
}
