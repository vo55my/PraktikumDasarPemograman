package latihan_3;

import java.util.Scanner;

public class PrakC3_203040119 {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan Nama : ");
		String nama = sc.next();
		System.out.print("Masukkan Password : ");
		String password = sc.next();
		
		if (nama.equalsIgnoreCase("admin") && password.equalsIgnoreCase("Rahasia")) {
			System.out.println("Selamat Datang");
		} else {
			System.out.println("Maaf Anda Siapa??");
		}
	}
}