package atividadequatro;


import java.util.Scanner;

public class atividadeQuatro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,n4,calculo;
		
		System.out.println("Digite numero 1 :");
		n1 = leia.nextFloat();
		
		System.out.println("Digite numero 2 :");
		n2 = leia.nextFloat();
		
		System.out.println("Digite numero 3 :");
		n3 = leia.nextFloat();
		
		System.out.println("Digite numero 4 :");
		n4 = leia.nextFloat();
		
		calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferenca é:" + calculo);

		
		




		
		

	}

}
