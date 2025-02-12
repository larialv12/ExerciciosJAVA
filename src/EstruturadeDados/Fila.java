package EstruturadeDados;

import java.util.Scanner;


import java.util.LinkedList;

import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //fila de objetos para organizar ordem de chegada de clientes em um banco
		//menu que aceitara opcao 1 2 3 
		//1-Adiconar um novo cliente ( solicitar o nome do cliente 
		//2- Listar todos os clientes na fila
		//3- Chamar ( retirar) uma pessoa da fila
		
		//0 - O progama deve ser finalizadp
		Scanner leia = new Scanner(System.in);

		Queue<String> filaClientes = new LinkedList<String>();
		
		
		
		
		
		
		



       String nomeUsuario;
	    


		
	    int opcao ;
	    
		
		 
		 int contador;
		 
		 
		 System.out.println("1 - Adicionar cliente na Fila ");
			System.out.println("2 - Listar todos os clientes  ");
			System.out.println("3 - Retirar clientes da fila  ");
			System.out.println("0 - Sair ");
			
			
		 
		 
		 
		 do {
			 
				System.out.println("Escolha uma opcao: ");

			
				
				 opcao = leia.nextInt();
				 
                  leia.nextLine();

				
			
				
				 switch(opcao) {
				 
				 case 1 :

					 System.out.println("Digite seu nome:");
					 nomeUsuario = leia.nextLine();
					filaClientes.add(nomeUsuario);
					

			          if(filaClientes.contains(nomeUsuario)) {
						 
						System.out.println(  " Cliente adiconado! " );
					
					
			          }
					 
					 break;
					 
				
				 case 2 : 
					 
					 
		 	        		System.out.println(  filaClientes );
					 
					 
							
							
						break;
					 
				 case 3 :
					 
					 



					 if(filaClientes.isEmpty()) {
						 

						 
		 	        		System.out.println("A fila esta vazia!!");

					 
 
					 }
					 
					 else {
						 
		 	        		System.out.println(" Cliente " + filaClientes.poll() + " chamado");
		 	        		System.out.println(  filaClientes );


						 

						 
					 }
					 

					 
						 
						
						 


						 
						 
					
					 
					 

					 
					
						 
					 
					 
					 
					 
					 break;
					 
				 case 0:
					 
					 System.out.println("Programa finalizado!!");

					 
					 break;
			 
		 

	    
		 
				 } 
				 
		 } while(opcao != 0 );
  
				
				
		 			
		 
		 
		 
		
			 
		 
		
		 }
			 
		 
		 
		 
		 }
							
							
						

	
					 
	
	


				
				

			 
	
		 
		 
		 

		
		
		
	
			
			
			

	
	
		
		
		
		
		
		
		

		
		
	

    
