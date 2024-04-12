import org.junit.jupiter.api.Test;

import  org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
public class TestDato {
    @Test
    public void assertSameDatoReturnTrue(){
        Dato dato1 = Dato.getInstance();
        Dato dato2 = Dato.getInstance();
        Assertions.assertEquals(dato1, dato2);
    }
}
