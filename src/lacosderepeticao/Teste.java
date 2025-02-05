package lacosderepeticao;

import java.util.Scanner;


public class Teste {




	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	       Scanner leia = new Scanner(System.in);

	    int numerointeiro, par, impar; 
	    par =0;
	    impar =0;

	    for(int contador =  1; contador <11; contador++) {
	    System.out.println("digite o numero " + contador );
	    numerointeiro = leia.nextInt();

	    if (contador % 2 == 0) {
	        par++;
	    } else {
	        impar++;

	    }

	    }

	        System.out.println("total de numeros pares" + par );
	        System.out.println("total de numeros impares" + impar );
	    } 

	    }
	    


