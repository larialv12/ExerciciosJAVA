package EstruturadeDados;

import java.util.Stack;

import java.util.Scanner ;




public class Pillha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Stack<String> livros = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);

		int opcao;
		
	       String nomeLivro;

		
		
		 
		 System.out.println("1 - Adicionar Livro na Pilha ");
			System.out.println("2 - Listar todos os livros ");
			System.out.println("3 - Retirar livros da pilha ");
			System.out.println("0 - Sair ");
			
			
		 
		 
		 
		 do {
			 
				System.out.println("Escolha uma opcao: ");

			
				
				 opcao = leia.nextInt();
				 
                 leia.nextLine();

				
			
				
				 switch(opcao) {
				 
				 case 1 :

					 System.out.println("Digite o nome do livro:");
					 nomeLivro = leia.nextLine();
					livros.add(nomeLivro);
					

			          if(livros.contains(nomeLivro)) {
			        	  
							System.out.println(livros);

						 
						System.out.println(  "Livro adiconado!!" );
					
					
			          }
					 
					 break;
					 
				
				 case 2 : 
					 
					 
		 	        		System.out.println(  livros );
					 
					  break;
					 
				 case 3 :
					 

					 
					 
					 if(livros.isEmpty()) {
						 

						 
		 	        		System.out.println("A pilha esta vazia!!");

					 

					 }
					 
					 else {
						     livros.pop(); 
						     
			 	        		System.out.println(  livros );

						 
						 
		 	        		System.out.println("Um livro foi removido da pilha");

						 }
					 

					 break;
					 
				 case 0:
					 
					 System.out.println("Programa finalizado!!");

					 
					 break;
			 
		 

	    
		 
				 } 
				 
		 } while(opcao != 0 );
 
				
				
		 			
		 
		 
		 
		
		
		
		

	}

}
