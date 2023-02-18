package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutacao {

	public void permutacao(int num1, int num2) {
		String stringNum1 = String.valueOf(num1);
		String stringNum2 = String.valueOf(num2);
		Integer qtdeCharNum1 = stringNum1.length();	
		Integer qtdeCharNum2 = stringNum2.length();	
		List<Integer> digitos1 = new ArrayList<>();
		List<Integer> digitos2 = new ArrayList<>();
		
		if (qtdeCharNum1 == qtdeCharNum2) {
			if (num1 == num2) {
				System.out.println("Os números são iguais.");
				return;
			}
			while (num1 > 0) {
				digitos1.add(num1 % 10);
				num1 /= 10;
			}
			while (num2 > 0) {
				digitos2.add(num2 % 10);
				num2 /= 10;
			}
			Collections.sort(digitos1);
			Collections.sort(digitos2);
			if (digitos1.equals(digitos2)) {
				System.out.println("Os números são permutaveis um com o outro");
			}
			else {
				System.out.println("Os númeors não são permutaveis um com o outro");
			}
		}
		else {
			System.out.println("Quantidade de digitos dos números são diferentes.");
			return;
		}
		
	}
}
