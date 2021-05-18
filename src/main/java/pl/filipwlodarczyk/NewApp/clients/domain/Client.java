package pl.filipwlodarczyk.NewApp.clients.domain;

public class Client {
    private String name;
    private String nickname;
    private int debit;

    public Client(String name, String nickname, int debit) {
        this.name = name;
        this.nickname = nickname;
        this.debit = debit;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getDebit() {
        return debit;
    }
}
