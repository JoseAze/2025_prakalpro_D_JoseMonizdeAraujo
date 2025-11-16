package tugasAlproPekan7_2511538002;
import java.util.Scanner;

public class Registrasai_2511538002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM REGISTRASI AKUN ===");

        System.out.print("Masukkan Username : ");
        String username = input.nextLine();

        System.out.print("Masukkan Password : ");
        String password = input.nextLine();

        System.out.print("Masukkan Email    : ");
        String email = input.nextLine();

        System.out.print("Masukkan PIN Angka: ");
        int pinAngka = input.nextInt();

       
        akun akun = new akun();
        akun.setUsername(username);
        akun.setPassword(password);
        akun.setEmail(email);
        akun.setPinAngka(pinAngka);

       
        if (!akun.isPasswordValid()) {
            System.out.println("ERROR: Password minimal 8 karakter!");
            return;
        }

        if (!akun.isEmailValid()) {
            System.out.println("ERROR: Email harus mengandung '@' dan '.'");
            return;
        }

       
        System.out.println("\n=== REGISTRASI BERHASIL ===");
        System.out.println("Username : " + akun.getUsername());
        System.out.println("Password : " + akun.getPassword());
        System.out.println("Email    : " + akun.getEmail());
        System.out.println("PIN      : " + akun.getPinAngka());

        
        System.out.println("\n--- MANIPULASI STRING ---");
        System.out.println("Username Uppercase : " + username.toUpperCase());
        System.out.println("Email Lowercase    : " + email.toLowerCase());
        System.out.println("Panjang Username   : " + username.length());
        System.out.println("Index '@' pada email: " + email.indexOf("@"));
		

	}

}
