package pl.filipwlodarczyk.NewApp.ui.text;

import java.util.Scanner;

public class TextMainView {

    public void init() {
        System.out.println("System do zarządzania debetami");

        System.out.println("----------------");

        System.out.println("Wciśnij 1 żeby wyświetlić liste klientów z debetami");
        System.out.println("Wciśnij 2 żeby dodać nowego klienta");
        System.out.println("Wcisnij 3 zeby usunąć klienta");
        System.out.println("Wcisnij 4 żeby wyjść");

        Scanner sc = new Scanner(System.in);
        
        boolean isMenuRunning = true;

        while (isMenuRunning) {

            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Lista klientów z debetami");
                    break;
                }

                case 2 -> {
                    System.out.println("Dodawanie nowego klienta");
                    break;

                }

                case 3 -> {
                    System.out.println("Wybierz klienta którego chcesz usunąć");
                    break;

                }

                case 4 -> {
                    isMenuRunning = false;
                }
            }
        }
    }
}
