package pl.filipwlodarczyk.NewApp.models;

public class Client {
    private String name;
    private String nickname;
    private int debit;

    public Client(String name, String nickname, int debit) {
        this.name = name;
        this.nickname = nickname;
        this.debit = debit;
    }
}
