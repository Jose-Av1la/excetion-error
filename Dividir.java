package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dividir {

    //www.mediafireparatodos.com
    // public static int numerador=10;
    //public static int denominador=0;
    public static float division;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerador;
        System.out.println("numerador");
        numerador = entrada.nextInt();
        int denominador;
        System.out.println("denominador");
        denominador = entrada.nextInt();
        System.out.println("Antes de la divicion");
        try {
            division = numerador / denominador;
        } catch (InputMismatchException e) {
            System.out.println("Error" + e.getMessage());
        } catch (NumberFormatException a) {
            System.out.println("Error" + a.toString());

        }finally {
            System.out.println("ingreso al finally");
        }
    }
}
