package no.rubstubs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testEncode {
    @Test
    void shouldEncodeEnglishNoWrap() {
        String plain = "abc";
        String cipher = Encode.encodeSpecific(2, "eng", plain);
        assertEquals(cipher, "CDE");
    }

    @Test
    void shouldEncodeEnglishWrap() {
        String plain = "fyx";
        String cipher = Encode.encodeSpecific(13, "eng", plain);
        assertEquals(cipher, "SLK");
    }

    @Test
    void shouldEncodeNorwegianNoWrap() {
        String plain = "abc";
        String cipher = Encode.encodeSpecific(2, "nor", plain);
        assertEquals(cipher, "CDE");
    }

    @Test
    void shouldEncodeNorwegianWrap() {
        String plain = "oyø";
        String cipher = Encode.encodeSpecific(13, "nor", plain);
        assertEquals(cipher, "ÆIK");
    }

    @Test
    void shouldFail() {
        assertEquals(1,2);
    }
}
