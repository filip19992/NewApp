package pl.filipwlodarczyk.NewApp.ui.text;

import pl.filipwlodarczyk.NewApp.ClientService;

import java.util.Scanner;

public class TextMainView {

    private final ClientService clientService = new ClientService();

    public void init() {

        Scanner sc = new Scanner(System.in);

        boolean isMenuRunning = true;

        System.out.println("System do zarządzania debetami");
        System.out.println("----------------");

        while (isMenuRunning) {

        System.out.println("Wciśnij 1 żeby wyświetlić liste klientów z debetami");
        System.out.println("Wciśnij 2 żeby dodać nowego klienta");
        System.out.println("Wcisnij 3 zeby usunąć klienta");
        System.out.println("Wcisnij 4 żeby wyjść");

            Scanner scanner = new Scanner(System.in);
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Lista klientów z debetami");
                    clientService.showClients();
                }

                case 2 -> {
                    this.addClient(scanner, scanner);
                }

                case 3 -> {
                    System.out.println("Wybierz klienta którego chcesz usunąć");
                }

                case 4 -> {
                    isMenuRunning = false;
                }
            }
        }
    }

    private void addClient(Scanner scanner, Scanner scanner2) {
        System.out.println("Podaj imie debeciarza");
        String name = scanner.nextLine();
        System.out.println("Podaj ksywke");
        String nickname = scanner2.nextLine();
        System.out.println("Teraz ilośc debetu(cyfra)");
        int debit = scanner.nextInt();
        this.clientService.createNewClient(name, nickname, debit);
    }
}
