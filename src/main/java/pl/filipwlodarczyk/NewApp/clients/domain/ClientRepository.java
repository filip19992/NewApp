package pl.filipwlodarczyk.NewApp.clients.domain;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import pl.filipwlodarczyk.NewApp.clients.domain.Client;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository {

    private List<Client> clientList = new ArrayList<>();

    Client createClient(String name, String nickname,int debit){
        Client newClient = new Client(name, nickname, debit);
        this.clientList.add(newClient);
        System.out.println("Utworzono klienta, imie: " + newClient.getName());
        return newClient;
    }


     void getClientList() {
        for(Client client : clientList) {
            System.out.println(client.getName() + " " + client.getNickname() + " " + client.getDebit());
        }
    }

    void readAll() throws IOException {
Gson gson = new Gson();
FileReader fileReader = new FileReader("./clients.json");
        List<Client> loaderClientList = gson.fromJson(fileReader, new TypeToken<List<Client>>() {}.getType());
        this.clientList.addAll(loaderClientList);

    }

    void saveAll() throws IOException {
        Gson gson = new Gson();
        FileWriter fileWriter = new FileWriter("./clients.json");
        gson.toJson(this.clientList, fileWriter);
        fileWriter.flush();
        fileWriter.close();
    }
}
