package Ejer2;

/**
 * La clase {@code Password} representa un generador de contraseñas con métodos para generar contraseñas
 * y verificar si son fuertes o no.
 *
 * <p>Incluye métodos para generar contraseñas, verificar si una contraseña es fuerte y más.</p>
 *
 * @author Juan
 * @version 1.0
 * @since 2024-01-24
 */
public final class Password {

    private final static int LONG_DEF = 8;

    private int longitud;

    private String contrasenya;

    /**
     * Construye un nuevo objeto Password con la longitud predeterminada.
     */
    public Password() {
        this(LONG_DEF);
    }

    /**
     * Construye un nuevo objeto Password con la longitud especificada.
     *
     * @param longitud La longitud de la contraseña.
     */
    public Password(int longitud) {
        this.longitud = longitud;
        contrasenya = generaPassword();
    }

    /**
     * Obtiene la longitud de la contraseña.
     *
     * @return La longitud de la contraseña.
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Establece la longitud de la contraseña.
     *
     * @param longitud La longitud de la contraseña.
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Obtiene la contraseña generada.
     *
     * @return La contraseña generada.
     */
    public String getContrasenya() {
        return contrasenya;
    }

    /**
     * Genera una contraseña aleatoria basada en la longitud especificada.
     *
     * @return La contraseña generada.
     */
    public String generaPassword() {
        return null;
    }

    /**
     * Verifica si la contraseña es fuerte.
     *
     * @return {@code true} si la contraseña es fuerte, {@code false} en caso contrario.
     */
    public boolean esFuerte() {
        return false;
    }

    /**
     * Verifica si la contraseña es fort.
     *
     * @return {@code true} si la contraseña es fort, {@code false} en caso contrario.
     */
    public boolean esFort() {
        return false;
    }
}
