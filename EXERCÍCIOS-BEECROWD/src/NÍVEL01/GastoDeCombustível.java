package N�VEL01;

import java.util.Scanner;

public class GastoDeCombust�vel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double KmL = 12;
		double KmH = sc.nextDouble();
		double VL = sc.nextDouble();
		double GC = (VL / KmL) * KmH;

		System.out.println(String.format("%.3f", GC));

	}

}
