package NÍVEL01;

import java.util.Scanner;

public class ÁreadoCírculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = 3.14159, area = 0;
		double raio = scanner.nextDouble();
		area = n * Math.pow(raio, 2);

		System.out.println(String.format("A=%.4f", area));
		System.out.println("Fim!!");
	}

}
