package tugas_4;

import java.util.Scanner;

public class TugasDua {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int bilangan = 0;
		int total = 0;
		
		System.out.print("Masukkan Bilangan Bulat : ");
		while (true) {
			bilangan = sc.nextInt();
		if (bilangan == 0) {
			break;
			}
		total = total + bilangan;
		}
		System.out.print("Total Bilangan Bulat : " + total);
	}
}