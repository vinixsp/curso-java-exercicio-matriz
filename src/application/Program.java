package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da matriz (linhas e colunas): ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("\nInforme " + m + " valores inteiros para preencher a linha da matriz: ");
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Informe o número que deve ser procurado: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (num == matriz[i][j]) {
					System.out.println("Position: " + i + ", " + j);
					if (j > 0) {  // se J maior que zero, tem elemento a esquerda
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (i > 0) {  // se I maior que zero, tem elemento acima
						System.out.println("Top: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {  // se J menor que o tamanho da matriz - 1, tem elemento a direita
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {  // Se I menor que o numero de linhas - 1, tem elemento abaixo
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
