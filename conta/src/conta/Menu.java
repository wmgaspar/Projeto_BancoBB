package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.util.Cores;
import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		ContaController contas = new ContaController();
			
		/*// Teste CC
		ContaCorrente cc1 = new ContaCorrente(2,123,1,"Mariana",150000.0f,1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		// Teste CP
		ContaPoupanca cp1 = new ContaPoupanca(3,123,2,"Victor",100000.0f,15);
		cp1.visualizar();
		cp1.sacar(12000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();*/
		
		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {
			System.out.println(Cores.TEXT_YELLOW+Cores.ANSI_BLACK_BACKGROUND+"""
					**********************************************
					            BANCO DO BRAZIL COM Z
					**********************************************
					   1 - Criar Conta
					   2 - Listar todas as Contas
					   3 - Buscar Conta por Numero
					   4 - Atualizar dados da Conta
					   5 - Apagar Conta
					   6 - Sacar
					   7 - Depositar
					   8 - Transferir valores entre Contas
					   9 - Sair
					 ************************************************
					""");
			System.out.print(Cores.TEXT_WHITE_BOLD+"Entre com a opção desejada: ");
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao =0;
			}

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Criar Conta\n\n");
				contas.listarTodas();
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Listar todas as Contas\n\n");
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Consultar dados da Conta\n\n");
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar dados da Conta\n\n");
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar Conta\n\n");
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Saque\n\n");
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Depósito\n\n");
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Transferência valores entre Contas\n\n");
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD+"Opção Inválida!\n");
				keyPress();
				break;

			}

		}

	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET+"\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla inválida!");
		}
	}
	
}
