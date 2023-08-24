import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Jameson";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int sair = 4;
        int opcao = 1;


        System.out.println("******************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da Conta" + tipoConta);
        System.out.println("Saldo atual " + saldo);
        System.out.println("\n******************************");

//        String menu = """
//        ** Digite sua opção **
//        1 - Consultar salto
//        2 - Transferir valor
//        3 - Receber valor
//        4 - Sair
//        """;

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4) {
            System.out.println("** Digite sua opção no banco do Jameson **\n" +
                    "1 - Consultar salto\n" +
                    "2 - Sacar valor\n" +
                    "3 - Receber valor\n" +
                    "4 - Sair");
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo é " + saldo);
            }else if (opcao == 2){
                System.out.println(" Qual o valor que deseja sacar");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println(" Saque feito com sucesso agora seu saldo agora é " + saldo);
                }
            }else if (opcao == 3){
                    System.out.println("Valor a depositar: ");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Depósito feito com sucesso, seu saldo agora é " + saldo);
                } else if (opcao > 5){
                System.out.println("Opção inválida, insira uma das opções abaixo:  ");
                }
            }
        }
    }

