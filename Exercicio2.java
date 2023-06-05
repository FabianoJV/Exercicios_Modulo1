package Exercicios.Exercicios_Modulo1;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o salario mensal:");
        double sm = input.nextDouble();

        System.out.println("Informe o percentual de reajuste:");
        double pr = input.nextDouble();

        double pc = pr / 100;
        double ns = sm + (sm * pc );
        System.out.println("O valor do salario com reajuste é de " + ns + "R$" );

        input.close();
    }
}
