package aula13;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mostre a Temperatura em Graus Celsious");
        double temperatura = scanner.nextDouble();
        double f = temperatura * 9 /5 + 32;
        System.out.println("A temperatura em farenheint" + f );
    }
}
