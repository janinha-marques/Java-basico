package Aula24.exercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.marca = "Phillips";
        lampada1.tipo = "Led_Baloon";
        lampada1.voltagem = 220;
        lampada1.preco = 70.45;
        lampada1.temperatura =  3000;
        lampada1.potencia = 7;
        lampada1.serialNumber = "7479";


        Lampada lampada2 = new Lampada();
        lampada2.marca = "NORDECOR";
        lampada2.tipo = "LED_Baloon";
        lampada2.voltagem = 220;
        lampada2.preco = 60.45;
        lampada2.temperatura =  4500;
        lampada2.potencia = 3;
        lampada2.serialNumber = "6986";

        EstoqueLampada estoqueLampada1 = new EstoqueLampada();
        estoqueLampada1.lampada= lampada1;
        estoqueLampada1.quantidade = 315;

        EstoqueLampada estoqueLampada2 = new EstoqueLampada();
        estoqueLampada2.lampada = lampada1;
        estoqueLampada2.quantidade = 215;

        Map<String, EstoqueLampada> mapaEstoque = new HashMap<>();
        mapaEstoque.put(lampada1.serialNumber, estoqueLampada1);
        mapaEstoque.put(lampada2.serialNumber, estoqueLampada2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva qual o serial number desaeja consultar no estoque");
        String serialNumberProcurado = scanner.nextLine();

        if (!mapaEstoque.containsKey(serialNumberProcurado)){
            System.out.println("Serial number não emcontrado!");
            return;
        }
        EstoqueLampada estoqueLampadaEncontrada = mapaEstoque.get(serialNumberProcurado);
        estoqueLampadaEncontrada.imprimir();


        /*System.out.println("SerialNumber: " + estoqueLampadaEncontrada.lampada.serialNumber);
                    System.out.println("Marca: " + estoqueLampadaEncontrada.lampada.marca);
                    System.out.println("Tipo: " + estoqueLampadaEncontrada.lampada.tipo);
                    System.out.println("Voltagem: " + estoqueLampadaEncontrada.lampada.voltagem);
                    System.out.println("Preco: " + estoqueLampadaEncontrada.lampada.preco);
                    System.out.println("Temperatura: " + estoqueLampadaEncontrada.lampada.temperatura);
                    System.out.println(" Potencia: " + estoqueLampadaEncontrada.lampada.potencia);
                    System.out.println("Quantidade no estoque: " + estoqueLampadaEncontrada.quantidade);*/



    }
}
