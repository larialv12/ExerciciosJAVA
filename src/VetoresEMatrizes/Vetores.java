package VetoresEMatrizes;

import java.util.Scanner;

public class Vetores {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
		 * construa um algoritmo que consiga pesquisar dados no vetor, 
		 * onde o usuário irá digitar um número e o programa deve exibir na tela 
		 * a posição deste número no vetor. Caso o número não seja encontrado, 
		 * a mensagem: "Não foi encontrado!" deve ser exibida na tela. */
		
		/*
		 * vetor inteiro 10 dados *
		 * pesquisar dentro do vetor(if)
		 * usuario digita um numero(Scanner) *
		 * buscar posição numero(usuario) no vetor caso contrário "Não foi encontrado!" 
		 */
					//	0|1|2|3|4|5|6|7|8| 9
		int numero[] = {2,5,1,3,4,9,7,8,10,6};
		int numeroUsuario;
		boolean achei = false;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numeroUsuario=leia.nextInt();
		
		//System.out.println(numeroUsuario);
		
		//System.out.println(numeroUsuario );
		//System.out.println();

		// for percorrer 10 posições 
		// numeroUsuario = 3, 5, 20
		for(int numeroFor = 0; numeroFor<10;numeroFor ++ ) {
			//numero usuario == numero do array
			if(numeroUsuario == numero[numeroFor]) {
				System.out.println("posição é: " + (numeroFor));
				achei = true;
			}
		}
		if(achei==false) { //!achei
			System.out.println("Não foi encontrado!");
		}
		//
	}

}