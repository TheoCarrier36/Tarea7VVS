
public class Funciones {

    // Concatena dos cadenas de texto
    public String concatenar(String a, String b) {
        return a + b;
    }

    // Devuelve la longitud de una cadena de texto
    public int longitud(String s) {
        return s.length();
    }


    // Verifica si una cadena es un palíndromo
    public boolean esPalindromo(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reverse);
    }

    // Reemplaza una palabra en una cadena por otra palabra
    public String reemplazarPalabra(String s, String objetivo, String reemplazo) {
        return s.replace(objetivo, reemplazo);
    }

    // Transforma una cadena según el tipo de transformación
    public String transformar(String s, String tipo) {
        switch (tipo.toUpperCase()) {
            case "MAYUSCULAS":
                return s.toUpperCase();
            case "MINUSCULAS":
                return s.toLowerCase();
            case "INVERTIR":
                return new StringBuilder(s).reverse().toString();
            default:
                throw new IllegalArgumentException("Tipo de transformación desconocido: " + tipo);
        }
    }
}
