package Ejer1;

/**
 * La clase {@code Principal} contiene el método principal que demuestra el uso de las utilidades de {@code SocUtil}.
 *
 * <p>En este ejemplo, se verifican varias propiedades numéricas utilizando las utilidades proporcionadas.</p>
 *
 * @author Juan
 * @version 1.0
 * @since 2024-01-24
 */
public class Principal {
    /**
     * Método principal que demuestra el uso de las utilidades de {@code SocUtil}.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        try {
            System.out.println("12345 es capicúa: " + SocUtil.esCapikua(12345));
            System.out.println("1221 es capicúa: " + SocUtil.esCapicua(1221));
            System.out.println("1234321 es capicúa: " + SocUtil.esCapikua(1234321));
        } catch (EsNegativoEX ex) {
            // Manejo de la excepción por número negativo
        }
    }
}
