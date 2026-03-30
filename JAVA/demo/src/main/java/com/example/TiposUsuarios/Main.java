package com.example.TiposUsuarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Criando usuários fixos para teste
        Gerente gerente = new Gerente("Carlos", "gerente@email.com", "123");
        Vendedor vendedor = new Vendedor("Ana", "vendedor@email.com", "123");
        Atendente atendente = new Atendente("João", "atendente@email.com", "123");

        int opcao;

        do {
            System.out.println("\n===== SISTEMA =====");
            System.out.println("1 - Gerente");
            System.out.println("2 - Vendedor");
            System.out.println("3 - Atendente");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    menuGerente(sc, gerente);
                    break;

                case 2:
                    menuVendedor(sc, vendedor);
                    break;

                case 3:
                    menuAtendente(sc, atendente);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    // ================= GERENTE =================
    public static void menuGerente(Scanner sc, Gerente gerente) {
        int op;

        do {
            System.out.println("\n--- MENU GERENTE ---");
            System.out.println("1 - Login");
            System.out.println("2 - Gerar relatório financeiro");
            System.out.println("3 - Consultar vendas");
            System.out.println("4 - Alterar dados");
            System.out.println("5 - Alterar senha");
            System.out.println("6 - Logoff");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    gerente.login();
                    break;
                case 2:
                    gerente.gerarRelatorioFinanceiro();
                    break;
                case 3:
                    gerente.consultarVendas();
                    break;
                case 4:
                    System.out.print("Novo nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String email = sc.nextLine();
                    gerente.alterarDados(nome, email);
                    break;
                case 5:
                    System.out.print("Nova senha: ");
                    String senha = sc.nextLine();
                    gerente.alterarSenha(senha);
                    break;
                case 6:
                    gerente.logoff();
                    break;
            }

        } while (op != 0);
    }

    // ================= VENDEDOR =================
    public static void menuVendedor(Scanner sc, Vendedor vendedor) {
        int op;

        do {
            System.out.println("\n--- MENU VENDEDOR ---");
            System.out.println("1 - Login");
            System.out.println("2 - Realizar venda");
            System.out.println("3 - Consultar vendas");
            System.out.println("4 - Alterar dados");
            System.out.println("5 - Alterar senha");
            System.out.println("6 - Logoff");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    vendedor.login();
                    break;
                case 2:
                    vendedor.realizarVenda();
                    break;
                case 3:
                    vendedor.consultarVendas();
                    break;
                case 4:
                    System.out.print("Novo nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String email = sc.nextLine();
                    vendedor.alterarDados(nome, email);
                    break;
                case 5:
                    System.out.print("Nova senha: ");
                    String senha = sc.nextLine();
                    vendedor.alterarSenha(senha);
                    break;
                case 6:
                    vendedor.logoff();
                    break;
            }

        } while (op != 0);
    }

    // ================= ATENDENTE =================
    public static void menuAtendente(Scanner sc, Atendente atendente) {
        int op;

        do {
            System.out.println("\n--- MENU ATENDENTE ---");
            System.out.println("1 - Login");
            System.out.println("2 - Receber pagamento");
            System.out.println("3 - Fechar caixa");
            System.out.println("4 - Alterar dados");
            System.out.println("5 - Alterar senha");
            System.out.println("6 - Logoff");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    atendente.login();
                    break;
                case 2:
                    System.out.print("Valor recebido: ");
                    double valor = sc.nextDouble();
                    atendente.receberPagamento(valor);
                    break;
                case 3:
                    atendente.fecharCaixa();
                    break;
                case 4:
                    System.out.print("Novo nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String email = sc.nextLine();
                    atendente.alterarDados(nome, email);
                    break;
                case 5:
                    System.out.print("Nova senha: ");
                    String senha = sc.nextLine();
                    atendente.alterarSenha(senha);
                    break;
                case 6:
                    atendente.logoff();
                    break;
            }

        } while (op != 0);
    }
}
