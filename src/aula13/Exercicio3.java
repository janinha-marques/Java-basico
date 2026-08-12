package aula13;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args ){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva o primeiro número: ");
    float numero1 = scanner.nextFloat();

    System.out.println("Escreva o segundo número: ");
    float numero2 = scanner.nextFloat();

    float soma = numero1 +numero2;
    System.out.println("O resultado da soma é: " + soma);
    }
}
