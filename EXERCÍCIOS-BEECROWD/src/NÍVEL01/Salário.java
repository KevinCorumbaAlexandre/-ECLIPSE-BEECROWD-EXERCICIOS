package NÍVEL01;

import java.util.Scanner;

public class Salário {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int NUMBER = sc.nextInt();
		int H = sc.nextInt();
		double VH = sc.nextDouble();
		double SALARY = (VH * H);

		System.out.println("NUMBER = " + NUMBER);
		System.out.println(String.format("SALARY = U$ %.2f",SALARY));

	}

}
