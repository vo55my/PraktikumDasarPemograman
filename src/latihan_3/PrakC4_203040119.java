package latihan_3;

import java.util.Scanner;

public class PrakC4_203040119 {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan Jenis Kelamin (L/P) : ");
		String jKelamin = sc.next();
		
		if (jKelamin.equalsIgnoreCase("L") || jKelamin.equalsIgnoreCase("P")) {
			System.out.println("Selamat Anda dalam keadaan baik");
		} else {
			System.out.println("Maaf, Jenis Kelamin anda apa??");
		}
	}
}