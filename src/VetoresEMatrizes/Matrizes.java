package VetoresEMatrizes;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Elabore um algoritmo que leia uma Matriz 3x3 de números 
		 * inteiros e em seguida, mostre na tela:
			Todos os elementos da Diagonal Principal
			Todos os elementos da Diagonal Secundária
			A Soma de todos os elementos da Diagonal Principal
			A Soma de todos os elementos da Diagonal Secundária

		 */
		
		/*
		 * matriz 3x3 -> inteiro**
		 * 
		 * exibir diagonal principal **
		 * exibir diagonal secundaria
		 * soma diagonal principal ***
		 * soma diagonal secundaria
		 */
		
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int totalDiagonal1 = 0;
		int totalDiagonal2 = 0;
		/*
		 * {1,2,3}
		 * {4,5,6}
		 * {7,8,9}
		 * 
		 * 1 - 5 - 9
		 * 0|0 - 1|1 - 2|2 (indices)
		 * 
		 * 0|2 - 1|1 - 2|0
		 */
		
		for(int linha = 0; linha <=2; linha ++) {
			//System.out.println(linha + "-" + linha );
			System.out.println("linha = " + linha + "coluna =" + linha +
					"valor da posição = "+ matriz[linha][linha]);
			//soma e atribuição 
			//totalDiagonal = totalDiagonal + matriz[linha][linha];
			totalDiagonal1 += matriz[linha][linha];
			
		}
		
		System.out.println("O total da soma da diagonal principal é: " + totalDiagonal1);
		
		for(int linha = 0; linha <=2; linha ++) {
			for(int coluna = 2; coluna >= 0; coluna--) {
				//System.out.println("linha" + linha + "coluna" + coluna);
				
				if(linha + coluna == 2) {
					System.out.println("linha = " + linha + "coluna =" + coluna +
							"valor da posição = "+ matriz[linha][coluna]);
					totalDiagonal2 += matriz[linha][coluna];
				}
			}
			
			
		}
		System.out.println("Total da diagonal 2: " + totalDiagonal2);
	}

}
