package N�VEL01;

import java.util.Scanner;

public class Sal�rioComB�nus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULO DE COMISS�O DE 15%\n");
		System.out.println("Digite o nome do func�onario:");
		String nome = sc.next();
		System.out.println("Digite o valor do sal�rio:");
		double salario = sc.nextDouble();
		System.out.println("Digite o valor das vendas :");
		double vd = sc.nextDouble();
		double comissao = (vd / 100) * 15 + salario;

		System.out.println(String.format("TOTAL DO SALARIO+COMISS�O : %.2f", comissao));

	}

}