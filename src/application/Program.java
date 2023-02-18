package application;

import java.util.Scanner;

import entities.Permutacao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		Permutacao permutacao = new Permutacao();
		
		System.out.println("Digite dois números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		permutacao.permutacao(num1, num2);
			
		sc.close();
	}
}
