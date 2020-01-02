package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    int dividendo;
    int divisor;

    public Division() {
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public double divicionn() {
        int r = 0;
        boolean correcto = false;
        do {
            try {
                leer();
                r = getDividendo() / getDivisor();
                correcto = true;
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir para cero" + e);
            } catch (InputMismatchException t) {
                System.out.println("No se puede ingresar texto" + t);
            }
        } while (!correcto);
        return r;

    }

    public void leer() {
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese el Dividendo");
        setDividendo(dato.nextInt());
        System.out.println("Ingrese el Divisor");
        setDivisor(dato.nextInt());
    }
}
