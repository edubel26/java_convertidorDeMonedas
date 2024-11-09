import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConvertirAPI convertirAPI = new ConvertirAPI();

        int opcion = 0;
        double monto = 0;

        String tipoDeMonedaACambiar = "";
        String resultadoDeMonedaACambiar = "";

        String menu = ("""
                ******************************************************
                
                Sea bienvenido/a al Conversor de Moneda =]
        
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción Válida:
           
                ******************************************************
                """);

        String valorACambiarMensaje = "Ingresa el valor que deseas convertir";

        while (true) {
            System.out.println(menu);

            try {
                opcion = lectura.nextInt();

                // Verificar si la opción está en el rango usando VerificadorDeNumero
                VerificadorDeNumero.verificarNumero(opcion);

                if (opcion == 7) {
                    break;
                }

                switch (opcion) {
                    case 1:
                        tipoDeMonedaACambiar = "USD";
                        resultadoDeMonedaACambiar = "ARS";
                        break;
                    case 2:
                        tipoDeMonedaACambiar = "ARS";
                        resultadoDeMonedaACambiar = "USD";
                        break;
                    case 3:
                        tipoDeMonedaACambiar = "USD";
                        resultadoDeMonedaACambiar = "BRL";
                        break;
                    case 4:
                        tipoDeMonedaACambiar = "BRL";
                        resultadoDeMonedaACambiar = "USD";
                        break;
                    case 5:
                        tipoDeMonedaACambiar = "USD";
                        resultadoDeMonedaACambiar = "COP";
                        break;
                    case 6:
                        tipoDeMonedaACambiar = "COP";
                        resultadoDeMonedaACambiar = "USD";
                        break;
                    default:
                        System.out.println("Escoger una opción válida");
                        continue;
                }

                System.out.println(valorACambiarMensaje);
                monto = lectura.nextDouble();

                Conversor conversor = convertirAPI.convertir(tipoDeMonedaACambiar, resultadoDeMonedaACambiar, monto);
                double resultado = conversor.conversion_result();

                System.out.println("\nEl valor " + monto +
                        " [" + tipoDeMonedaACambiar + "]" + " corresponde al valor de =>> " +
                        resultado + " " + "[" + resultadoDeMonedaACambiar + "]" + "\n");

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor, ingresa un número válido.");
                lectura.nextLine(); // Limpia el buffer para evitar un bucle infinito.
            } catch (NumeroFueraDeRangoException e) {
                System.out.println("Excepción: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        System.out.println("Finalizó la ejecución del programa!");
    }
}