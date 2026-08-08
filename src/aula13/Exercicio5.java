package aula13;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe os metros para serem convertidos: ");
    double metro = scanner.nextDouble();
    double centimetros = metro * 100;
        System.out.println(metro + "m são" +  centimetros + " cm. ");


    }
}
