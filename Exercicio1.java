package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius:");
        double grauC = input.nextDouble();

        double f = ((9 * grauC) + 160) / 5;
        System.out.println("A temperatura informada em graus Celsius é:" + f + " em graus Fahrenheit" );

        input.close();

    }
}
