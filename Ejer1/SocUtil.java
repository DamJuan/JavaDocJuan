package Ejer1;

public class SocUtil {
    public static boolean esCapikua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int numAlReves = 0;
        int copia = numero;
        while (numero > 0) {
            numAlReves = numAlReves * 10 + numero % 10;
            numero /= 10;
        }
        return copia == numAlReves;
    }

    public static boolean esCapicua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        String cadNum = Integer.toString(numero);
        String numAlReves = (new StringBuilder(cadNum)).reverse().toString();
        return cadNum.equals(numAlReves);
    }

    public static boolean esPrimo(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        if (numero < 2) {
            return false;
        }
        int limite = (int) Math.sqrt(numero) + 1;
        for (int i = 2; i < limite; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long getFactorial(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX("no se puede calcular el factorial de un número negativo");
        }
        long factorial = 1L;
        while (numero > 1) {
            factorial *= numero;
            numero--;
        }
        return factorial;
    }
}
