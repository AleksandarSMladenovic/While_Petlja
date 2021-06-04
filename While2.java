package whilePetlja;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {

		/*
		 * While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku
		 * noc!” onoliko puta koliko je korisnik zadao preko konzole. Primer: ako
		 * korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesi broj ispisa laku noc: ");
		int brojIspisa = s.nextInt();
		int i = 0;
		
		while (i < brojIspisa) {
			System.out.println("Laku noc!");
			i++;
		}
	}
}
