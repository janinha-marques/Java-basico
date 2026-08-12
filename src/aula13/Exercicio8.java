package aula13;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto voce ganha por hora?");
        double salario = scanner.nextDouble();
        System.out.println("Quantas horas voce trabaha no mês?");
        double horas = scanner.nextDouble();

        double resultado = (salario * horas);
        System.out.println("o seu salarito total é de : " + resultado);
    }
}
