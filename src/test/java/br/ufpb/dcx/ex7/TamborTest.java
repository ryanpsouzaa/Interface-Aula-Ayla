package br.ufpb.dcx.ex7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TamborTest {

    @Test
    public void testaConstrutor() {
        EmissorDeSom emissor = new Tambor("G", "Genérico");
        assertNotNull(emissor.emitirSom());
        assertFalse(emissor.emitirSom().equals(""));
    }

}
