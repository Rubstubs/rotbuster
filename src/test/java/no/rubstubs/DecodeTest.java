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

    @Test
    void shouldReturnAllDecodedAlternativesNorwegian() {
        String cipher = "ABC";
        char[] allDecoded = Decode.decodeAll( "nor", cipher);
        assertEquals( 29, allDecoded.length);
    }

    @Test
    void shouldReturnAllDecodedAlternativesEnglish() {
        String cipher = "ABC";
        char[] allDecoded = Decode.decodeAll( "eng", cipher);
        assertEquals( 26, allDecoded.length);
    }

    @Test
    void shouldReturnNull() {
        assertNull(Decode.decodeSpecific(12, "not-a-language", "abc"));
        assertNull(Decode.decodeSpecific(55, "eng", "abc"));
    }
}