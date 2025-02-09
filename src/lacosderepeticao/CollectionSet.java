package lacosderepeticao;

import java.util.Scanner ;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		

		Set<Integer> setNumeros = new HashSet<Integer>();		
		
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		int numeroUsuario;
		
		
		do {
     		System.out.println("Digite um numero");


    		numeroUsuario = leia.nextInt();

          
        	  if(setNumeros.contains(numeroUsuario)) {
        		
         		System.out.println("O numero " + numeroUsuario + " foi encontrado ");
         		

   }

        	  
    } while(numeroUsuario >= 0  && numeroUsuario < 10);
       		System.out.println("O numero" + "\s" + numeroUsuario + " nao foi encontrado"  );
     

			
		 
 		
		
 		


		}
		
		
		
		
		// TODO Auto-generated method stub

	}


