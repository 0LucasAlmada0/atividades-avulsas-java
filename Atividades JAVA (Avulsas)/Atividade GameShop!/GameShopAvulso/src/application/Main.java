package application;

import java.util.Scanner;

import entities.GameShop;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Código: ");
		int codigo = sc.nextInt();
		System.out.print("Digite a Idade: ");
		int idade = sc.nextInt();

		GameShop gameShop = new GameShop(codigo, idade);

		gameShop.Menu();

		int escolha = sc.nextInt();

		while (escolha != 5) {
			switch (escolha) {
			case 1:
				System.out.println("Quantas Horas Gostaria de Comprar?: ");
				gameShop.Comprar(sc.nextInt());
				gameShop.Menu();
				escolha = sc.nextInt();
				break;

			case 2:
				System.out.println("Vamos Jogar! Quantas Horas Você Vai Jogar?: ");
				gameShop.Jogar(sc.nextInt());
				gameShop.Menu();
				escolha = sc.nextInt();
				break;

			case 3:
				System.out.println("Você Ganhou Um BRINDE! Dobrei sua Quantidade de Horas!");
				gameShop.Brinde();
				escolha = sc.nextInt();
				break;

			case 4:
				System.out.println("Olá, possuinte do código: " + gameShop.getCodigo() + "!" + "\nVocê tem "
						+ gameShop.getQtdHoras() + " Horas!");
				gameShop.Menu();
				escolha = sc.nextInt();
				break;

			default:
				System.out.println("Opção Inválida!");
				gameShop.Menu();
				escolha = sc.nextInt();
				break;
			}
		}

		System.out.println("Obrigado por Jogar com a gente! Volte Sempre!");
		sc.close();
	}
}
