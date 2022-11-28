package controle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Comment for an other push
public class TestMarcOlivierCas {

    @Test
    public void testSpendMoney() {
        MarcOlivierCas marcOlivierCas = new MarcOlivierCas();
        marcOlivierCas.spendMoney(100);
        assertEquals(50, marcOlivierCas.money);
    }

    @Test
    public void testSendMessage() {
        MarcOlivierCas marcOlivierCas = new MarcOlivierCas();
        marcOlivierCas.sendMessage("Hello, are you ? 'From Marc Olivier CAS'");
        assertEquals("Hello, are you ? 'From Marc Olivier CAS'", marcOlivierCas.message);
    }

    @Test
    public void testCheckMoney() {
        MarcOlivierCas marcOlivierCas = new MarcOlivierCas();
        marcOlivierCas.checkMoney(150, 100);
        assertEquals(50, marcOlivierCas.money);
        if (marcOlivierCas.money < 0) {
            assertEquals("You are in debt", marcOlivierCas.debt);
        } else if (marcOlivierCas.money == 0){
            assertEquals("You are poor, go to work !", marcOlivierCas.noMoneyLeft);
        } else {
            assertEquals("You are not broke, you can go to the casino !", marcOlivierCas.moneyLeft);
        }
    }
}
