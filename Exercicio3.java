package Exercicios.Exercicios_Modulo1;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor numero inteiro:");
        double ni = input.nextDouble();

        double s = ni + 1;
        double a = ni - 1;
        System.out.println("O numero sucessor ao informado é:" + s);
        System.out.println("O numero antecessor ao informado é:" + a);

        input.close();
    }
}

