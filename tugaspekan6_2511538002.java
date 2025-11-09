package pekan6_2511538002;
import java.util.Scanner;
import java.util.Random;
public class tugaspekan6_2511538002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int dadu1, dadu2, hasil;
		int tebakan;
		int percobaan = 0;
		String ulang;
		
		
		do {
			dadu1 = rand.nextInt(6)+ 1;
			dadu2 = rand.nextInt(6) + 1;
			hasil = dadu1 + dadu2;
			percobaan++;
			
			System.out.println(dadu1 + " + " + dadu2 +" = " + hasil);
			
			if (hasil ==7) { 
				System.out.println("Tebakan anda Benar");
				System.out.println("Anda menang setelah "+ percobaan + " percobaan!" );
				break;
			} else {
				System.out.println("Tebakan Anda salah");
				System.out.print("apakah mau lempar dadu lagi(ya/tidak)");
				ulang = input.next();
				if (ulang.equalsIgnoreCase ("Tidak")) {
					System.out.println("Anda gagal menang");
					break;
				}
			}
		} while (true);
		
		input.close();
	}
}
				
		
			
			
		
		
	
		
