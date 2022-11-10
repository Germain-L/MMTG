package controle;

public class MarcOlivierCas {

    String message;

    int money = 150;

    public void MarcOlivierCas() {
        this.message = "Hello world";
    }

    public void MarcOlivierCas(String message) {
        this.message = message;
    }

    public void MarcOlivierCas(int money) {
        this.money = money;
    }

    public void spendMoney(int money) {
        var objet = 100;
        this.money = this.money - objet;
    }
}
