package NÍVEL01;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		Double FR = (4 / 3.0) * 3.14159 * (Math.pow(R, 3));

		System.out.println(String.format("VOLUME = %.3f", FR));

	}

}
