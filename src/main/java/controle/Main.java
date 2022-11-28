package controle;

public class Main {
    public static void main() {
        Max max = new Max();
        Thomas thomas = new Thomas();
        MarcOlivierCas mocc = new MarcOlivierCas();
        Germain germain = new Germain();

        germain.sayHelloTo("Thomas");
        germain.calculate(80, 5, "Thomas");
    }
}
