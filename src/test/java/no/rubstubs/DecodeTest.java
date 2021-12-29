package no.rubstubs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {
    @Test
    void shouldDecodeRot2WithoutWrap() {
        String cipher = "CDE";
        String plain = Decode.decodeSpecific(2, "eng", cipher);
        assertEquals(plain, "abc");
    }

}