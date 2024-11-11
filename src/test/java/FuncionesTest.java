import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionesTest {

    Funciones opsCadena = new Funciones();

    @Test
    public void testConcatenar() {
        assertEquals("HolaMundo", opsCadena.concatenar("Hola", "Mundo"));
    }

    @Test
    public void testLongitud() {
        assertEquals(4, opsCadena.longitud("Hola"));
    }


    @Test
    public void testEsPalindromo() {
        assertTrue(opsCadena.esPalindromo("radar"));
        assertFalse(opsCadena.esPalindromo("hola"));
    }

    @Test
    public void testReemplazarPalabra() {
        assertEquals("Hola profe", opsCadena.reemplazarPalabra("Hola profesora", "profesora", "profe"));
    }

    @Test
    public void testTransformar() {
        assertEquals("HOLA", opsCadena.transformar("hola", "MAYUSCULAS"));
        assertEquals("hola", opsCadena.transformar("HOLA", "MINUSCULAS"));
        assertEquals("aloh", opsCadena.transformar("hola", "INVERTIR"));

        // Prueba para un tipo de transformación desconocido
        assertThrows(IllegalArgumentException.class, () -> opsCadena.transformar("hola", "DESCONOCIDO"));
    }
}
