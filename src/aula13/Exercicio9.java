package aula13;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatura em farenheit");
        double temperatura = scanner.nextDouble();
        double Celsius = (temperatura - 32 ) * 5 / 9;
        System.out.println("A temperatura em Celsius é de :  " + Celsius);

    }
}
