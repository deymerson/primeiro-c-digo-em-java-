import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double estoqueJatiboca, estoquePontal, entradaEstoque;
		int menuPrincipal = 0, empresa = 0;

		do{
			System.out.print("Entre com o estoque inicial de a��car empresa 1 - Jatiboca: ");
			estoqueJatiboca = entrada.nextDouble();
			System.out.print("Entre com o estoque inicial de a��car empresa 2 - Pontal: ");
			estoquePontal = entrada.nextDouble();
			System.out.println("-------------------------------------------------------------");

			if(estoqueJatiboca < 0 || estoquePontal < 0) {
				System.out.println("Um dos valores inseridos foi menor que 0. Por favor, entre com os valores novamente.");
				System.out.println("-------------------------------------------------------------");
			}

		}while(estoqueJatiboca < 0 || estoquePontal < 0);

		do {
			System.out.println("O que deseja fazer:");
			System.out.printf("	1 - Entrada de Estoque\n	2 - Saida de Estoque \n	3 - Transfer�ncia de Estoque\n	4 - Consulta de Estoque\n	5 - Finalizar \n");
			System.out.print("Op��o -> ");
			menuPrincipal = entrada.nextInt();
			System.out.println("");

			if(menuPrincipal < 5){
				if(menuPrincipal < 3)
				{
					System.out.printf("Qual empresa:\n");
					System.out.printf("	1 - Jatiboca\n	2 - Pontal \n");
					System.out.print("Op��o -> ");
					empresa = entrada.nextInt();
				}

				if(menuPrincipal==3)
				{
					System.out.printf("Qual empresa:\n");
					System.out.printf("	1 - Jatiboca -> Pontal \n");
					System.out.printf("	2 - Pontal -> Jatiboca \n");
					System.out.print("Op��o -> ");
					empresa = entrada.nextInt();
				}
				System.out.println("");

				switch(menuPrincipal){
					case 1:
						if(empresa == 1)
						{
							System.out.printf("Qual a quantidade de Entrada de a�ucar em Jatiboca -> ");
							entradaEstoque = entrada.nextDouble();
							estoqueJatiboca += entradaEstoque;
							System.out.println("");
							System.out.printf("Estoque atualizado em Jatiboca -> %.2f kg\n", estoqueJatiboca);
						}
						else
						{
							System.out.printf("Qual a quantidade de Entrada de a�ucar em Pontal -> ");
							entradaEstoque = entrada.nextDouble();
							estoquePontal += entradaEstoque;
							System.out.println("");
							System.out.printf("Estoque atualizado em Jatiboca -> %.2f kg\n", estoquePontal);
						}
						break;

					case 2:
						if(empresa == 1)
						{
							System.out.printf("Qual a quantidade de Sa�da de a�ucar em Jatiboca -> ");
							entradaEstoque = entrada.nextDouble();
							System.out.println("");
							if(entradaEstoque > estoqueJatiboca) {
								System.out.println("N�o � poss�vel efetuar esta retirada. Estoque insuficiente.");
							}else{
								estoqueJatiboca -= entradaEstoque;
								System.out.printf("Estoque atualizado em Jatiboca -> %.2f kg\n", estoqueJatiboca);
							}

						}
						else
						{
							System.out.printf("Qual a quantidade de Sa�da de a�ucar em Pontal -> ");
							entradaEstoque = entrada.nextDouble();
							System.out.println("");
							if(entradaEstoque > estoquePontal){
								System.out.println("N�o � poss�vel efetuar esta retirada. Estoque insuficiente.");
							}else{
								estoquePontal -= entradaEstoque;
								System.out.printf("Estoque atualizado em Jatiboca -> %.2f kg\n", estoquePontal);
							}

						}
						break;

					case 3:
						if(empresa == 1)
						{
							System.out.printf("Quantidade de transfer�ncia de a�ucar: Jatiboca para Pontal -> ");
							entradaEstoque = entrada.nextDouble();
							System.out.println("");
							if(entradaEstoque > estoqueJatiboca) {
								System.out.println("Imposs�vel transferir de Jatiboca para Pontal. Estoque insuficiente!");
							}else{
								estoqueJatiboca -= entradaEstoque;
								estoquePontal += entradaEstoque;
								System.out.printf("Estoque atualizado em Jatiboca -> %.2f kg\n", estoqueJatiboca);
								System.out.printf("Estoque atualizado em Pontal -> %.2f kg\n", estoquePontal);
							}

						}
						else
						{
							System.out.printf("Quantidade de transfer�ncia de a�ucar: Pontal para Jatiboca -> ");
							entradaEstoque = entrada.nextDouble();
							System.out.println("");
							if(entradaEstoque > estoquePontal) {
								System.out.println("Imposs�vel transferir de Pontal para Jatiboca. Estoque insuficiente!");
							}else{
								estoquePontal -= entradaEstoque;
								estoqueJatiboca += entradaEstoque;
								System.out.printf("Estoque atualizado em Jatiboca -> %.2f kg\n", estoqueJatiboca);
								System.out.printf("Estoque atualizado em Pontal -> %.2f kg\n", estoquePontal);
							}

						}
						break;

					case 4:
						System.out.printf("Estoque em Jatiboca -> %.2f kg\n", estoqueJatiboca);
						System.out.printf("Estoque em Pontal -> %.2f kg\n", estoquePontal);
						break;
				}

				System.out.printf("------------------------------------------------------------- \n");
				System.out.println("");


			}else{
				System.out.printf("Sistema encerrado. Bom dia e um bom trabalho !!!");
			}

		}
		while(menuPrincipal < 5);
	}

}

