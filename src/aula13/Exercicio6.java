package aula13;

import java.util.Scanner;

public class Exercicio6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o raio: ");
            float raio = scanner.nextFloat();
            double area = Math.PI * raio * raio;
            System.out.println("A área do círculo é: " + area);
        }
}
