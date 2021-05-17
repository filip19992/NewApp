package pl.filipwlodarczyk.NewApp;

import pl.filipwlodarczyk.NewApp.models.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {

    private List<Client> clientList = new ArrayList<>();

    Client createClient(String name, String nickname,int debit){
        Client newClient = new Client(name, nickname, debit);
        this.clientList.add(newClient);
        return newClient;
    }

    public List<Client> getClientList() {
        return this.clientList;
    }
}
