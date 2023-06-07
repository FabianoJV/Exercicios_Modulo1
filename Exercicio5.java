package Exercicios.Exercicios_Modulo1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor numero negativo:");
        int n = input.nextInt();

        if (n < 0) {
            int r = n * (-1);
            System.out.println("O valor em numero positivo é: " + r );
        }
        else {
            System.out.println("O valor informado " + n + " já é positivo");
        }

        input.close();
    }
}
