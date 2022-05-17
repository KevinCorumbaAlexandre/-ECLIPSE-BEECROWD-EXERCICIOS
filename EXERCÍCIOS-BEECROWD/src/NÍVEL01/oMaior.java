package NÍVEL01;

import java.util.Scanner;

public class oMaior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int MAIOR = ((a + b + Math.abs(a - b)) / 2);
		if (MAIOR > c) {
			System.out.println(MAIOR + " eh o maior");
		} else {
			System.out.println(c + " eh o maior");
		}

	}

}
