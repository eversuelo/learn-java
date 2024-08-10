import java.util.Arrays;

public class Variables_02 {
    public static void main(String [] args){
        //Variables Tipadas con tipos primitivos;
        int number=10;
        char character='A';
        float numberDecimal= 10.66F;
        boolean verdad=false;
        //Tenemos precision simple y doble;
        double v = 101252.022252E-10;
        System.out.println("v = " + v);
        byte numberByte= 127;
        System.out.println("number2 = " + numberByte);
        //El string es un objeto;
        String saludar="Hola String";
        System.out.println(character);
        System.out.println(number);
        System.out.println("number decimal  "+numberDecimal+"\n");
        System.out.println("concatenado "+saludar);

        System.out.println("verdad = " + verdad);
    }
}
