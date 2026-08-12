import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTitulo();

        int opcaoEscolhida = -1;
        while (opcaoEscolhida != 0) {
            imprimirOpcoesPrincipais();
            opcaoEscolhida = scanner.nextInt();


            switch (opcaoEscolhida) {
                case 0:
                    break;
                case 1:
                    //chamar função de reserva;
                    break;
                case 2:
                    imprimirCardapio();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        System.out.println("Programa encerrado, espero que voce aproveite seu jantar");
    }
    static void imprimirTitulo(){
        System.out.println("-" + "----------------------");
        System.out.println("| - CANTINA DA NONNA -|");
        System.out.println("-----------------------");
    }

    static void imprimirOpcoesPrincipais() {

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Reserva");
        System.out.println("2 - Consultar cardápio");
        System.out.println("0 - Encerrar programa");
    }
    static void imprimirCardapio(){

               /* List<String> categorias = new Arraylist<>();
                categorias.add("Massas");
                categorias.add("bebidas");
                categorias.add("Pizzas");
                categorias.add("Sobremesas");
                categorias.add("Aperitivos");
                categorias.add("Risotos");
                categorias.add("Vinhos");*/

        Map<String, List<String>> cardapio = new HashMap<>();
        cardapio.put("Massas", List.of("Lasanha", "Talharim", "Penne"));
        cardapio.put("Bebidas", List.of("Refrigerasnte", "Àgua sem gás", "Vodka", "Cerveja"));

        for (String cardapioChaveAtual : cardapio.keySet()) {
            System.out.println("- " + cardapioChaveAtual);

            List<String> categoriaAtual = cardapio.get(cardapioChaveAtual);
            for (int pos = 0; pos < categoriaAtual.size(); pos++) {
                System.out.println("--" + categoriaAtual.get(pos));

            }


        }



        List<String> categorias = List.of("Massas","Bebidas", "Pizzas", "Sobremesas", "Aperitoivos", "Risotos", "Vinhos");

        System.out.println("Categorias");
        for (int pos = 0; pos < categorias.size(); pos++) {
            System.out.println(categorias.get(pos));
        }

       /* System.out.println(categorias.get(0));
        System.out.println(categorias.get(1));
        System.out.println(categorias.get(2));
        System.out.println(categorias.get(3));
        System.out.println(categorias.get(4));*/

        }

    }
