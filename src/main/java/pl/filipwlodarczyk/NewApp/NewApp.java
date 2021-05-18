package pl.filipwlodarczyk.NewApp;

import pl.filipwlodarczyk.NewApp.clients.domain.ClientService;
import pl.filipwlodarczyk.NewApp.ui.text.TextMainView;

import java.io.IOException;

public class NewApp {
    public static void main(String[] args) throws IOException {
        ClientService clientService = new ClientService();
        TextMainView mainScreen = new TextMainView(clientService);
        mainScreen.init();
    }
}
