package no.rubstubs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {
    @Test
    void shouldDecodeRot13English() {
        String cipher = "CDE";
        String plain = Decode.decodeSpecific(13, "eng", cipher);
        assertEquals(plain, "pqr");
    }

    @Test
    void shouldDecodeRot13Norwegian() {
        String cipher = "ÆIK";
        String plain = Decode.decodeSpecific(13, "nor", cipher);
        assertEquals(plain, "oyø");
    }

}