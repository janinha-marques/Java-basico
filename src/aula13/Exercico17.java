package aula13;

import java.util.Scanner;

public class Exercico17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Exercício 17 ---");
        System.out.println("Informe a metragem total a ser pintada");

        double metragem = scanner.nextDouble();

        double qtdLitros = metragem / 6;
        System.out.println("Quantidade de litros necessários: + qtdLitros");

        double qtdLatas = Math.ceil(qtdLitros /18);
        double precoLatas = qtdLatas * 80;
        System.out.println("Preço das latas: " + precoLatas);

        double qtdGaloes = Math.ceil(qtdLitros /3.6)
    }
}

