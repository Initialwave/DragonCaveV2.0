import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testDragonCaveLost(){
        Main.processChoice("1");
        assertFalse(Main.won, "choice did not result in losing");
    }
    @Test
    void testDragonCaveWon(){
        Main.processChoice("2");
        assertTrue(Main.won, "Choice 2 did result in losing");
    }
}