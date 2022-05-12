package NÍVEL01;

import java.util.Scanner;

public class SalárioComBônus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULO DE SALARIO + COMISSÃO DE 15%\n");
		System.out.println("Digite o nome do funcíonario(a):");
		String nome = sc.next();
		System.out.println("Digite o valor do salário:");
		double salario = sc.nextDouble();
		System.out.println("Digite o valor das vendas :");
		double vd = sc.nextDouble();
		double comissao = (vd / 100) * 15 + salario;
		System.out.printf("Sr(a):" + nome + "\n");
		System.out.println(String.format("\nTOTAL DO SALARIO+COMISSÃO : %.2f", comissao));

	}

}