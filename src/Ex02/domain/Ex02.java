package Ex02.domain;

import java.io.Console;
import java.util.Scanner;

public class Ex02 {

    private static int numero1;
    private static int numero2;

    public Ex02(){

    }

    public void imprime(){
        System.out.println("----");
        System.out.println("O numero 1 foi: " + Ex02.numero1);
        System.out.println("O numero 2 foi: " + Ex02.numero2);
        if(Ex02.numero1 < Ex02.numero2){
            System.out.println("O numero1 eh menor que o numero2: ");
        }else {
            System.out.println("O numero 1 eh maior que o numero 2");
        }
    }
    public static void setNumero1(int numero1){
        Ex02.numero1 = numero1;
    }

    public static int getNumero1(){
        return Ex02.numero1;
    }

    public static void setNumero2(int numero2){
        Ex02.numero2 = numero2;
    }

    public static int getNumero2(){
        return Ex02.numero2;
    }

}
