package controle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMax {

    @Test
    public void testSendMessage() {
        Max max = new Max();
        max.sendMessage("Test, rarity. 'From Max DH'");
        assertEquals("Test, rarity. 'From Max DH'", max.message);
    }

    @Test
    public void testEvaluationRarity() {

    }
}