import java.util.Scanner;

public class Condicionales_03 {

    public static void main(String[] args) {
        /*
         * El objeto Scanner:
         * La clase Scanner se utiliza para leer datos del teclado.
         * El método nextInt() se utiliza para leer un número entero.
         * En el ejemplo, se crea una variable numero de tipo int.
         * Se utiliza el método nextInt() para leer un número del teclado y se guarda en la variable numero.
         * Finalmente, se muestra el valor de la variable numero por pantalla.
         */
        //Leemos desde consola
        Scanner leer = new Scanner(System.in);
        int number=leer.nextInt();
        if (number==8){
            System.out.println("El número es igual a 8");
        } else if (number<8) {
            System.out.println("number 8 > " + number);
        }else{
            System.out.println("Número mayor a 8");
        }
    }
}
