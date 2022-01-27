package no.rubstubs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {
    @Test
    void shouldDecodeRot13() {
        String cipher = "CDE";
        String plain = Decode.decodeSpecific(13, cipher);
        assertEquals(plain, "pqr");
    }

    @Test
    void shouldReturnAllDecodedAlternatives() {
        String cipher = "ABC";
        ArrayList<String> allDecoded = Decode.decodeAll( cipher);
        assertEquals( 26, allDecoded.size());
    }
}