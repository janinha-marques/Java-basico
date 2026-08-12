package aula13;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número do lado a: ");
        double a = scanner.nextDouble();
        System.out.println("Informe o número do lado b: ");
        double b = scanner.nextDouble();
        double area = a * b;
        System.out.println("a área é de: " + area + "cm²");

    }
}
