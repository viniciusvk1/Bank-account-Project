package application;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.ContaController;
import model.contaCorrente;
import model.ContaPoupanca;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ContaController contas = new ContaController();

        int opcao;

        contaCorrente cc1 = new contaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
        cc1.visualizar();
        cc1.sacar(12000.0f);
        cc1.visualizar();
        cc1.depositar(5000.0f);
        cc1.visualizar();

        ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
        cp1.visualizar();
        cp1.sacar(1000.0f);
        cp1.visualizar();
        cp1.depositar(5000.0f);
        cp1.visualizar();

        while (true) {

            System.out.println("""
                    *****************************************************
                    |                                                   |
                    |               BANCO DO BRAZIL COM Z               |
                    |                                                   |
                    *****************************************************
                    |                                                   |
                    |           1 - Criar Conta                         |
                    |           2 - Listar todas as Contas              |
                    |           3 - Buscar Conta por Numero             |
                    |           4 - Atualizar Dados da Conta            |
                    |           5 - Apagar Conta                        |
                    |           6 - Sacar                               |
                    |           7 - Depositar                           |
                    |           8 - Transferir valores entre Contas     |
                    |           0 - Sair                                |
                    |                                                   |
                    *****************************************************
                    Entre com a opção desejada:""");

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                sc.nextLine();
                opcao = 0;
            }
            ;

            if (opcao == 9) {
                System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n Criar Conta");

                    keyPress();
                    break;
                case 2:
                    System.out.println("\n Listar todas as Contas");
                    contas.listarTodas();
                    keyPress();
                    break;
                case 3:
                    System.out.println("\n Buscar Conta por número");

                    keyPress();
                    break;
                case 4:
                    System.out.println("\n Atualizar dados da Conta");

                    keyPress();
                    break;
                case 5:
                    System.out.println("\n Apagar Conta");

                    keyPress();
                    break;
                case 6:
                    System.out.println("\n Sacar");

                    keyPress();
                    break;
                case 7:
                    System.out.println("\n Depositar");

                    keyPress();
                    break;
                case 8:
                    System.out.println("\n Transferir");

                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção Inválida");

                    keyPress();
                    break;
            }
        }
    }

    private static void keyPress() {
        try {

            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");
        }

    }
}