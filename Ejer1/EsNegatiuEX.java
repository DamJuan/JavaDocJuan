package Ejer1;

public class EsNegatiuEX extends Exception {
    /**
     * Construye un nuevo EsNegativoEX con un mensaje de error predeterminado.
     */
    public EsNegatiuEX() {
        super("el valor no puede ser negativo");
    }

    /**
     * Construye un nuevo EsNegativoEX con un mensaje de error personalizado.
     * @param msg Mensaje de error personalizado.
     */
    public EsNegatiuEX(String msg) {
        super(msg);
    }
}
