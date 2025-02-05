package lacoscondcionais;

import java.util.Scanner;

public class ExercicioDois {
	
	//Exercicio doacao de sangue

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		
		System.out.println("Digite seu nome");
		
		String nome;
		
		nome = leia.nextLine();
		
		
		
		System.out.println("Digite sua Idade");
		
		
		
		int idade;
		
		idade = leia.nextInt();
		
		System.out.println("É sua primeira doacao?");
		
		boolean primeiraDoacao  ;
		primeiraDoacao = leia.nextBoolean();		
		
		if(idade >= 18 && idade <= 69 ) {
			
		}
			
		 if (primeiraDoacao == true) {
			 
				System.out.println(nome  + "\s"+ " está apto para doar sangue ");
				
		 }

		  
	
		  else {
				System.out.println(nome  + "\s" + " nao está apto para doar sangue ");

		  }
			  
		 
			
			
		}
		
		  
	
		  
}

	
		
			

