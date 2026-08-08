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

import java.util.Scanner;}
  }
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1 = capturarNota(scanner, ordinal: "primeira");
        float nota2 = ;capturarNota(scanner, ordinal: "segunda");

        float nota3 =
        float nota4 =

        float mjedia = (nota1 + nota2 = nota3 + nota4) / 4;
        System.outpr4intln("Sua média é:  " + media);

        static float capturarNota(Scanner, String ordinal){
            System.out.println("Escreva a " + ordinal nota:"");
            float nota = scanner.nextFloat();
            return nota;
        }

        }
    }
}