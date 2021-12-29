package no.rubstubs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EncodeTest {
    @Test
    void shouldEncodeEnglish() {
        String plain = "fyx";
        String cipher = Encode.encodeSpecific(13, "eng", plain);
        assertEquals(cipher, "SLK");
    }

    @Test
    void shouldEncodeNorwegia() {
        String plain = "oyø";
        String cipher = Encode.encodeSpecific(13, "nor", plain);
        assertEquals(cipher, "ÆIK");
    }

    @Test
    void shouldReturnNull() {
        assertNull(Encode.encodeSpecific(12, "not-a-language", "abc"));
        assertNull(Encode.encodeSpecific(55, "eng", "abc"));
    }
}