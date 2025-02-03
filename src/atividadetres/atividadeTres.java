package atividadetres;

import java.util.Scanner;

public class atividadeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto,adicionalNoturno,horasExtras,descontosColab, salarioLiquido;
		
		
		System.out.println("Digite seu salario bruto:");
		
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno:");
		
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras:");
		
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os descontos de colaborador:");
		
		descontosColab = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontosColab;


		System.out.println("O salario liquido é:" + salarioLiquido);

		



		

		   

	}

}
