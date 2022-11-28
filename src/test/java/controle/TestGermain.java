package controle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGermain {

    @Test
    public void testSayHelloTo() {
        Germain germain = new Germain();
        assertEquals("Hello Thomas", germain.sayHelloTo("Thomas"));
    }

    @Test
    public void testCalculate5Drinks() {
        Germain germain = new Germain();
        assertEquals("You can have 5 more drinks", germain.calculate(80, 5, "Thomas"));
    }

    @Test
    public void testCalculate10Drinks() {
        Germain germain = new Germain();
        assertEquals("You can have 0 more drinks", germain.calculate(80, 10, "Thomas"));
    }

    @Test
    public void testCalculate15Drinks() {
        Germain germain = new Germain();
        assertEquals("You are dead", germain.calculate(80, 15, "Thomas"));
    }
}
