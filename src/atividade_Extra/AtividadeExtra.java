package atividade_Extra;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeExtra {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		int opcaoMenu = -1;

		System.out.println("************************************************");
		System.out.println("\n1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da fila");
		System.out.println("0 - Sair\n");
		System.out.println("*************************************************");

		while (opcaoMenu != 0 && opcaoMenu <= 3) {

			System.out.println("Selecione Uma Opção: ");
			opcaoMenu = lerScanner.nextInt();
			lerScanner.nextLine();

			switch (opcaoMenu) {

			case 1:
				System.out.println("\nDigite o Nome do Cliente: ");
				fila.add(lerScanner.nextLine());
				System.out.println("Cliente adiconado com sucesso!\n");
				break;

			case 2:
				System.out.println("Lista de Clientes na Fila: ");

				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
					break;
				}

				System.out.println("\nFila: ");
				fila.forEach(System.out::println);
				break;

			case 3:
				

				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
					break;
				}

				System.out.println("O Cliente " + fila.poll() + " foi Chamado!");
				
				System.out.println("Fila: ");
				fila.forEach(System.out::println);

			}

			if (opcaoMenu > 3 || opcaoMenu < 0) {
				System.out.println("Opção Inválida");
				break;
			}
			 if (opcaoMenu == 0) {
				System.out.println("Programa Finalizado!");
			}
		}

	}
}
