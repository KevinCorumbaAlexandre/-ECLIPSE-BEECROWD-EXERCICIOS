package NÍVEL01;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		double L = sc.nextDouble();
		double consumo = km / L;

		System.out.println(String.format("%.3f km/l", consumo));

	}

}
