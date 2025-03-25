package atividade1_Fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_Fila {

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

			System.out.println("\nEntre com a Opção desejada: ");
			opcaoMenu = lerScanner.nextInt();
			lerScanner.nextLine();

			if (opcaoMenu == 1) {
				System.out.println("Digite o nome do Cliente: ");
				fila.add(lerScanner.nextLine());
				System.out.println("\nCliente adicionado com sucesso!\n");
				continue;
			}

			if (opcaoMenu == 2) {
				System.out.println("Lista de Clientes na Fila: \n");

				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
					continue;
				}
				System.out.println("Fila: ");
				fila.forEach(System.out::println);
				continue;

			}

			if (opcaoMenu == 3) {

				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
					continue;
				}
				
				System.out.println("O Cliente " + fila.poll() + " foi Chamado\n");
				System.out.println("Fila: ");
				fila.forEach(System.out::println);
				continue;

			}

			if (opcaoMenu > 3 || opcaoMenu < 0) {
				System.out.println("Opcão Inválida");
				continue;
			}

			System.out.println("Programa Finalizado!");
		}

		lerScanner.close();

	}
}
