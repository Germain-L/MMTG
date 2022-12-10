package controle;

public class Main {
    public static void main(String[] args) {
        Germain germain = new Germain();
        germain.sayHelloTo("Thomas");
        String result = germain.calculate(80, 5, "Thomas");
        System.out.println(result);

        MarcOlivierCas mocc = new MarcOlivierCas();
        mocc.spendMoney(50);
        mocc.checkMoney(150, 50);
        mocc.sendMessage("Hello, how are you ? 'From Marc Olivier CAS'");


        Thomas thomas = new Thomas();
        result = thomas.checkIv(30);
        System.out.println(result);

        Max max = new Max();
        max.evaluationRarity(87);

        System.out.println("The end");
    }
}
