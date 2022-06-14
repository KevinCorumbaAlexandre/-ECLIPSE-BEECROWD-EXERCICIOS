package NÍVEL01;
import java.util.Scanner;
public class beecrowd1019ConversãoDeTempo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		int n = sc.nextInt();

		int h = n / 3600;
		n -= h * 3600;
		int m = n / 60;
		n -= m * 60;
		int s =n;

		 System.out.println(h+":"+m+":"+s);
		
	}

}
