package pekan6_2511538002;
import java.util.Scanner;
public class perulanganWhile1_2511538002 {

	public static void main(String[] args) {
		int counter=0;
		String jawab;
		boolean running = true;
		//deklarasi Scaner
		Scanner scan = new Scanner(System.in);
		while (running) {
			counter++;
			System.out.println("jumlah = "+counter);
			System.out.print("Apakah lanjut (ya/tidak?)");
			jawab= scan.nextLine();
			if (jawab.equalsIgnoreCase("tidak")) {
				running=false;
			}
			 
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak"+counter+"kali");
		

	}

}
