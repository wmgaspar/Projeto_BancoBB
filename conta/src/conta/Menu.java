package conta;

import java.util.Scanner;
import conta.util.Cores;
import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(1,123,1,"Adriana",10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
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
			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Criar Conta\n\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Listar todas as Contas\n\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Consultar dados da Conta\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar Conta\n\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Saque\n\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Depósito\n\n");
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Transferência valores entre Contas\n\n");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD+"Opção Inválida!\n");
				break;

			}

		}

	}

}
