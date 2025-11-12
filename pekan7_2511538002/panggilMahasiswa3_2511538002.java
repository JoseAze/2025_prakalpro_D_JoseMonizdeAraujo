package pekan7_2511538002;

import java.util.Scanner;

public class panggilMahasiswa3_2511538002 {

	public static void main(String[] args) {
		Mahasiswa_2511538002 a = new Mahasiswa_2511538002();
		Scanner input = new Scanner(System.in);
		System.out.print("NIM: ");
		a.setNim2(input.nextLine());
		System.out.print("Nama: ");
		a.setNama(input.nextLine());
		if(a.getNim2().startsWith("25")) {
			System.out.println(a.getNama()+ " anda agkatak 2025");
		}
		if(a.getNim2().contains("8002")) {
			System.out.println(a.getNama()+ " Anda Mahasiswa Informatika");
		}
		a.cetak2();
		input.close();
		}
		

	}


