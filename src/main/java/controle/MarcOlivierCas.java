package controle;

public class MarcOlivierCas {

    String message;

    int money = 150;

    String debt = "You are in debt";

    String noMoneyLeft = "You are poor, go to work !";

    String moneyLeft = "You are not broke, you can go to the casino !";

    public void spendMoney(int objet) {
        this.money = this.money - objet;
    }

    public void sendMessage(String message) {
        this.message = message ;
    }

    public void checkMoney(int money, int spendMoney) {
        this.money = money - spendMoney;
        if (this.money < 0) {
            System.out.println(debt);
        } else if (this.money == 0){
            System.out.println(noMoneyLeft);
        } else {
            System.out.println(moneyLeft);
        }
    }
}
