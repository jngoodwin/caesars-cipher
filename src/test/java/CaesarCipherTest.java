import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherTest {
    private CaesarsCipher caesarsCipher = new CaesarsCipher();

    @Test
    void testCipheredMessageWithOffset12() {
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
    }

    @Test
    void testEmptyString() {
        assertEquals("", caesarsCipher.cipher("", 12));
    }

}
