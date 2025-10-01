package pekan4;

import java.util.Scanner;

public class multiIf {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner a= new Scanner (System.in);
		System.out.print("Input umur anda: ");
		umur= a.nextInt();
		System.out.print("Apakah Anda suda punya Sim C: ");
		sim=a.next().charAt(0);
		a.close();
		if ((umur >= 17)&&(sim=='y')) {
			System.out.println("Anda suda dewasa dan boleh bawa motor");
		}
		if((umur>=17)&&(sim!='y')) {
			System.out.println("Ända Sudah Dewasa tetapi tida boleh bawa motor");
		}
		if((umur< 17)&&(sim!='y')) {
			System.out.println("Anda Belum cukup Umur bawa motor");
		}
		if((umur< 17)&&(sim=='y')) {
			System.out.println("Anda Belum Cukup umur Punya SIM");
		}

	}

}
