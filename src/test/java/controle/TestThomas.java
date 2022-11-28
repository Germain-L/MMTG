package controle; 

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestThomas {

    @Test
    public void testSendMessage() {
        Thomas thomas = new Thomas();
        thomas.sendMessage("Hello, are you ? 'From Thomas'");
        assertEquals("Hello, are you ? 'From Thomas'", thomas.message);
    }

    @Test
    public void testCheckIv() {
        Thomas thomas = new Thomas();
        thomas.checkIv(45);
        assertEquals(45, thomas.iv);
        if (thomas.iv < 25) {
            assertEquals("This pokemon is weak", thomas.low);
        } else if (thomas.iv < 36){
            assertEquals("This pokemon is medium", thomas.medium);
        } else if (thomas.iv < 45){
            assertEquals("This pokemon is strong", thomas.high);
        } else {
            assertEquals("This pokemon is perfect", thomas.perfet);
        }
    }
}