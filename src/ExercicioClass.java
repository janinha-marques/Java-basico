import com.sun.source.doctree.SystemPropertyTree;
import exceptions.ValorNegativoException;

import javax.xml.transform.Source;
import java.util.Scanner;

    public class ExercicioClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Nonna");
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();

        Conta conta = new Conta(nome);

        System.out.println("Olá, " + nome + " !");

        boolean continuarPrograma = true;
        while (continuarPrograma) {
            imprimirOpcoes();
            int opcao = pegarOpcao(scanner);
        }

        switch (opcao) {
            case 0:
                continuarPrograma = false;
                break;
            case 1:
                System.out.println("Quanto deseja depositar?");
                double valor;
                try {
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                } catch (InputMismatchException exception) {
                    System.out.println("Valor digitado incorreto");
                    scanner.nextLine();
                } catch (ValorNegativoException exception) {
                    System.out.println(exception.getMessage());
                }
                break;
            case 2:


                //Sacar
                break;
            case 3:

                //Saldo
                break;
            default:
                System.out.println("Opção inválida !");
                break;

             }
        }
            System.out.println("Volte sempre");

        }

    }
         static int pegarOpcao(Scanner scanner){
        int resultado;
        try {
            resultado = scanner.nextInt();
        }  catch (Exception exception) {
            resultado = -1;
        }
        return resultado;

        }

         static  void imprimirOpcoes(){
             System.out.println(("O que deseja fazer?");
             System.out.println(("0 - Encerrar o programa");
            System.out.println(("1 - Depositar");
            System.out.println("2 - Sacar");

        }
    }

