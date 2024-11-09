public class VerificadorDeNumero {

    // Método que verifica si un número está en el rango de 1 a 7
    public static void verificarNumero(int opcion) throws NumeroFueraDeRangoException {
        if (opcion < 1 || opcion > 7) {
            throw new NumeroFueraDeRangoException("El número ingresado no está en el rango de 1 a 7.");
        }
    }
}