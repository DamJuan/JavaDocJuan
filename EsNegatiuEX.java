public class EsNegativoEX extends Exception {
    /**
     * Construye un nuevo EsNegativoEX con un mensaje de error predeterminado.
     */
    public EsNegativoEX() {
        super("el valor no puede ser negativo");
    }

    /**
     * Construye un nuevo EsNegativoEX con un mensaje de error personalizado.
     * @param msg Mensaje de error personalizado.
     */
    public EsNegativoEX(String msg) {
        super(msg);
    }
}
