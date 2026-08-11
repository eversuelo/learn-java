import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        // ----- SALIDA (OUTPUT) -----
        // print   -> imprime sin salto de línea
        // println -> imprime y agrega un salto de línea
        // printf  -> imprime con formato
        System.out.print("Esto se imprime ");
        System.out.println("en la misma línea.");
        System.out.println("Esto va en una línea nueva.");
        System.out.printf("Con formato: %d + %d = %d%n", 2, 3, 2 + 3);

        // ----- ENTRADA (INPUT) -----
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");

        // ----- CONVERSIÓN DE NÚMERO (TEXTO) A VARIABLE -----
        // Todo lo que se lee del teclado llega como texto (String).
        // Para hacer cálculos hay que convertirlo a un tipo numérico.

        System.out.print("Escribe un número entero: ");
        String enteroStr = scanner.nextLine();          // se lee como texto
        int entero = Integer.parseInt(enteroStr);       // texto -> int
        System.out.println("El doble de " + entero + " es " + (entero * 2));

        System.out.print("Escribe un número con decimales: ");
        String decimalStr = scanner.nextLine();         // se lee como texto
        double decimal = Double.parseDouble(decimalStr); // texto -> double
        System.out.println("La mitad de " + decimal + " es " + (decimal / 2));

        // Scanner también puede leer números directamente, sin parsear a mano:
        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();                   // lee y convierte a int
        System.out.println("El próximo año tendrás " + (edad + 1) + " años.");

        scanner.close();
    }
}
