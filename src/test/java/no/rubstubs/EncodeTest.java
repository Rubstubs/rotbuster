package no.rubstubs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeTest {
    @Test
    void shouldEncodeEnglish() {
        String plain = "fyx";
        String cipher = Encode.encodeSpecific(13, plain);
        assertEquals(cipher, "SLK");
    }
}