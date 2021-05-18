package pl.filipwlodarczyk.NewApp.clients.domain;


import pl.filipwlodarczyk.NewApp.clients.domain.Client;
import pl.filipwlodarczyk.NewApp.clients.domain.ClientRepository;

import java.io.IOException;

public class ClientService {

    private ClientRepository clientRepository = new ClientRepository();
    private Client client;


    public Client createNewClient(String name, String nickname, int debit){
        return this.clientRepository.createClient(name, nickname, debit);
    }

    public void showClients(){
        this.clientRepository.getClientList();
    }

    public void realAll() {
        try {
            this.clientRepository.readAll();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public void saveAll() throws IOException {
        this.clientRepository.saveAll();
    }
}
