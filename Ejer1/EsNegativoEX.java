package Ejer1;

/**
 * La clase {@code EsNegativoEX} es una excepción personalizada para indicar que un valor no puede ser negativo.
 * Se utiliza en situaciones donde se espera un valor no negativo, pero se proporciona uno negativo.
 *
 * <p>Puede construirse con un mensaje de error predeterminado o personalizado.</p>
 *
 * @author Juan
 * @version 1.0
 * @since 2024-01-24
 */
public class EsNegativoEX extends Exception {
    /**
     * Construye un nuevo {@code EsNegativoEX} con un mensaje de error predeterminado.
     */
    public EsNegativoEX() {
        super("El valor no puede ser negativo");
    }

    /**
     * Construye un nuevo {@code EsNegativoEX} con un mensaje de error personalizado.
     *
     * @param msg Mensaje de error personalizado.
     */
    public EsNegativoEX(String msg) {
        super(msg);
    }
}
