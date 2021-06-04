package whilePetlja;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {

		/*While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
		 *primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj:");
		int a = sc.nextInt();		
		int zbir = 0;
		
		while(a >= 0){
			zbir = zbir + a;
			System.out.println("Unesi broj:");
			a = sc.nextInt();			
		}
		
		System.out.println("Zbir pozitivnih brojeva je: "+ zbir);
		
	}

}
