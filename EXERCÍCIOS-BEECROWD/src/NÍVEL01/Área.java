package NÍVEL01;

import java.util.Scanner;
public class Área {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double TR = (a * c) / 2;
		double CR = Math.pow(c, 2) * 3.14159;
		double TZ = (a + b) * c / 2;
		double QD = Math.pow(b, 2);
		double RT = a * b;
		
		System.out.println(String.format("TRIANGULO: %.3f",TR));
		System.out.println(String.format("CIRCULO: %.3f",CR));
		System.out.println(String.format("TRAPEZIO: %.3f",TZ));
		System.out.println(String.format("QUADRADO: %.3f",QD));
		System.out.println(String.format("RETANGULO: %.3f",RT));
		
		
		
	}	
	}

}
