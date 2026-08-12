package aula13;

/* import java.util.Scanner;

public class Exercicio4 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular");
        Float nota = scanner.nextFloat();
        System.out.println(" Escreva a primeira nota");
        Float nota1 = scanner.nextFloat();
        System.out.println("Escreva a segunda nota");

        Float nota2 = scanner.nextFloat();
        System.out.println("Escreva a terceira nota");

        Float nota3 = scanner.nextFloat();
        System.out.println("Escreva a quarta nota");
        Float nota4 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua média é: "  + media); */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("vamos calcular sua média.");
        System.out.println("Escreva a primeira nota:");
        float nota1 = scanner.nextFloat();
        System.out.println("Escreva a segunada nota");
        float nota2 = scanner.nextFloat();
        System.out.println("Escreva a terceira nota");
        float nota3 = scanner.nextFloat();
        System.out.println("Escreva a quarta nota");
        float nota4 = scanner.nextFloat();

        float media = nota1 + nota2 + nota3 + nota4 / 4;
        System.out.print("Sua média é: " + media);
        }
    }
