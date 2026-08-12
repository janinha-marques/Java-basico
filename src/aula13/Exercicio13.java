package aula13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu gênero(m/F)");
        String sexo = scanner.nextLine();
        System.out.println("Informe sua altura");
        float altura = scanner.nextFloat();
        double pesoIdeal;

        if (sexo.equals("m")) {
            pesoIdeal = 72.7f * altura - 58;

        }    else {
            pesoIdeal = 62.1 * altura - 44.7f;
        }

            System.out.println(" Seu peso ideal é: " + pesoIdeal);

            System.out.println("Agota informe seu peso: ");
            float peso = scanner.nextFloat();

            if (peso == pesoIdeal) {
                System.out.println("Voce erstá dentro do s3eu peso ideal!");
            }  else if (peso < pesoIdeal) {
            System.out.println(" Voce est5a a baixo do peso ideal!");
        } else {
                System.out.println("Você está acima do peso ideal.");

        }

    }
}
