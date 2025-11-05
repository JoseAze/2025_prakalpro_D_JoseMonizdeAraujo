package pekan6_2511538002;
import java.util.Scanner;
public class Sentinel1Loop_2511528002 {

	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int sum= 0;
	int number=12;
	while (number !=0) {
		System.out.print("masukan angka(o untuk keluar): ");
		number = console.nextInt();
		sum=sum + number;
		
	}
	System.out.println("totalnya adalah" + sum);
	

	}

}
