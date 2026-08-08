package aula13;

import java.util.Scanner;

public class xercicio151 {
    java.util.Scanner;

    public class Main {
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


       /* if (idade < 0) {
            System.out.println("Você escreu sua idade errada!");
        } else if(idade >= 18) {
            System.out.println("Você é maior de idade!");
        }  else {
            System.out.println("Você é menor de idade!");

            }*/


            while (idade < 0) {
                System.out.println("Você escreu sua idade errada!");
                System.out.println("Quantos anos você tem?");
                idade = scanner.nextInt();
            }

            if (idade >= 18) {
                System.out.println("Você é maior de idade!");
            } else {
                System.out.println("Você é menor de idade!");
            }


            /* System.out.println("Continua!");*/
        }

    System.out.println("vamos calcular sua média.");
    System.out.println("Escreva a primeira nota:");
        float nota1 = scanner.nextFloat();
    System.out.println("Escreva a segunada nota");
        float nota2 = scanner.nextFloat();
    System.out.println("Escreva a terceira nota");
        float nota3 = scanner.nextFloat();
    System.out.print("Sua média é:");
        float media = calculoMedia(nota1, nota2, nota3);
    System.out.print(média);







        static float calcularMedia( float nota1, float nota2, float nota3) {
            float soma = nota1 + nota2 = nota3;
            float media = soma / 3.0f;

            return media;

        }
