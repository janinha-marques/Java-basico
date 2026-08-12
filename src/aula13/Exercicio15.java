package aula13;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String [] args) {
        String nome;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá");
        System.out.println("Qual o seu nome?");

        nome = scanner.nextLine();

        System.out.println("Tudo bem,");
        System.out.print(nome);
        System.out.println("?");

        //System.out.println("Tudo bem," + "nome" + "?");

        System.out.println("Quantos anos você tem?");

        int idade = scanner.nextInt();


        if (idade < 0) {
            System.out.println("Você escreveu sua idade errada!");
        } else if(idade >= 18) {
            System.out.println("Você é maior de idade!");
        }  else {
            System.out.println("Você é menor de idade!");

        }


        /*while (idade < 0) {
            System.out.println("Você escreu sua idade errada!");
            System.out.println("Quantos anos você tem?");
            idade = scanner.nextInt();
        }

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }*/
    }

}
