package NÍVEL01;
import java.util.Scanner;
public class CálculoSimples {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int cd1 = sc.nextInt();int np1 = sc.nextInt();double vp1 = sc.nextDouble();
		int cd2 = sc.nextInt();int np2 = sc.nextInt();double vp2 = sc.nextDouble();
		double VT = (np1*vp1)+(np2*vp2);
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f",VT));
		
		
		
		
		
		
	}

}
