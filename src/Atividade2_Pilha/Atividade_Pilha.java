package Atividade2_Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Atividade_Pilha {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		int opcaoMenu = -1;

		System.out.println("************************************************");
		System.out.println("\n1 - Adicionar um Livro na Pilha");
		System.out.println("2 - Listar todos os Livros");
		System.out.println("3 - Retirar Livro da pilha");
		System.out.println("0 - Sair\n");
		System.out.println("*************************************************");

		while (opcaoMenu != 0 && opcaoMenu <= 3) {

			System.out.println("\nEntre com a Opção desejada: ");
			opcaoMenu = lerScanner.nextInt();
			lerScanner.nextLine();

			if (opcaoMenu == 1) {
				System.out.println("Digite o nome do Livro: ");
				pilha.push(lerScanner.nextLine());
				System.out.println("\nLivro adicionado com sucesso!\n");
				continue;
			}

			if (opcaoMenu == 2) {
				System.out.println("Lista de Livros na Pilha: \n");

				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
					continue;
				}
				System.out.println("Pilha de Livros: ");
				pilha.forEach(System.out::println);
				continue;

			}

			if (opcaoMenu == 3) {

				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
					continue;
				}

				System.out.println("O Livro " + pilha.pop() + " foi retirado da Pilha\n");
				System.out.println("Fila: ");
				pilha.forEach(System.out::println);
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
