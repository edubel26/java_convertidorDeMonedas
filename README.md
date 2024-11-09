# Conversor de Moneda

Este programa es un **Conversor de Moneda** desarrollado en Java que permite convertir entre diferentes monedas. Las monedas disponibles para la conversión son las siguientes:

- Dólar (USD) a Peso argentino (ARS)
- Peso argentino (ARS) a Dólar (USD)
- Dólar (USD) a Real brasileño (BRL)
- Real brasileño (BRL) a Dólar (USD)
- Dólar (USD) a Peso colombiano (COP)
- Peso colombiano (COP) a Dólar (USD)

## Descripción

El programa interactúa con el usuario a través de la consola, mostrando un menú de opciones para elegir la conversión deseada. Una vez que el usuario selecciona una opción, el programa solicita el monto a convertir y muestra el resultado de la conversión.

### Funcionalidades:

1. **Menú interactivo**: El programa muestra un menú con las opciones disponibles para la conversión de divisas.
2. **Entrada de monto**: El usuario debe ingresar un monto para realizar la conversión.
3. **Conversión de divisas**: Dependiendo de la opción seleccionada, el programa realiza la conversión entre las monedas seleccionadas.
4. **Manejo de excepciones**: El programa maneja excepciones comunes como entradas no válidas (por ejemplo, texto en lugar de números) y valores fuera de un rango esperado.

### Excepciones:

- **InputMismatchException**: Se lanza cuando el usuario ingresa un valor que no es un número válido.
- **NumeroFueraDeRangoException**: Se lanza si la opción seleccionada no está dentro del rango válido.
- **Excepciones generales**: Cualquier otro error inesperado es manejado por el programa.

## Cómo utilizar el programa

1. **Ejecuta el programa**: Al iniciar, se mostrará un menú de opciones.
2. **Selecciona la opción de conversión**: Elige una de las opciones disponibles (1 a 6).
3. **Ingresa el monto**: Después de elegir una opción, ingresa el valor a convertir.
4. **Obtén el resultado**: El programa te mostrará el valor convertido a la moneda seleccionada.

## Requisitos

- Java 8 o superior.

## Estructura del código

El código está estructurado en las siguientes clases principales:

1. **Principal**: Contiene el flujo principal del programa y la interacción con el usuario.
2. **ConvertirAPI**: Clase que se encarga de la conversión de divisas.
3. **Conversor**: Clase que maneja el resultado de la conversión y la lógica detrás de ella.
4. **VerificadorDeNumero**: Utilizado para validar que el número ingresado por el usuario sea válido.
5. **NumeroFueraDeRangoException**: Excepción personalizada para manejar opciones fuera de rango.

## Conclusión

Este programa es útil para quienes necesitan realizar conversiones rápidas entre estas seis monedas específicas. Su diseño sencillo permite una fácil ampliación para agregar más monedas en el futuro si es necesario.
