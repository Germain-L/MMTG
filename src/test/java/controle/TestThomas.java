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
    public void testIv45() {
        Thomas thomas = new Thomas();
        thomas.checkIv(45);
        assertEquals("This pokemon is perfect", thomas.perfect);
    }

    @Test
    public void testIv30() {
        Thomas thomas = new Thomas();
        thomas.checkIv(30);
        assertEquals("This pokemon is strong", thomas.high);
    }

    @Test
    public void testIv20() {
        Thomas thomas = new Thomas();
        thomas.checkIv(20);
        assertEquals("This pokemon is weak", thomas.low);
    }

    @Test
    public void testIv27() {
        Thomas thomas = new Thomas();
        thomas.checkIv(27);
        assertEquals("This pokemon is medium", thomas.medium);
    }

    @Test
    public void testIv0() {
        Thomas thomas = new Thomas();
        thomas.checkIv(0);
        assertEquals("This pokemon is useless", thomas.useless);
    }
    @Test
    public void testIv4() {
        Thomas thomas = new Thomas();
        thomas.checkIv(0);
        assertEquals("This pokemon is useless", thomas.useless);
    }


}