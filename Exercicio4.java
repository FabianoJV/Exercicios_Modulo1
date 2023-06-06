package Exercicios.Exercicios_Modulo1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor:");
        double a = input.nextDouble();
        System.out.println("Informe outro valor:");
        double b = input.nextDouble();

        if (a >= b) {
            double r = a - b;
            System.out.print("A diferença entre o maior e o menor valor é de: " + r);
        }
        if (b > a) {
            double t = b - a;
            System.out.print("A diferença entre o maior e o menor valor é de: " + t);
        }

        input.close();
    }
}
