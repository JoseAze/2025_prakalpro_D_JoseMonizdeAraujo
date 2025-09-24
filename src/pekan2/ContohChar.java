package pekan2;

public class ContohChar {

	public static void main(String[] args) {
		// deklarasi variabel char
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka = '7';
		char simbol = '#';
				
				// Menampilkan nilai variabel char
				System.out.println("contoh variabel cahr:");
				System.out.println("Huruf pertama:"+ huruf1);
				System.out.println("Huruf kedua: " + angka);
				System.out.println("Angka: " + angka);
				System.out.println("Simbol: "+ simbol);
				
				// Operasi dengan char (berdasarkan kode unikode/ASCII)
				char huruf3 = (char) (huruf1 + 1); // A (65) + 1 = B (66)
				System.out.println("Huruf1 + 1 = " + huruf3);
				
				// Char juga bisa disimpan dalam integer (ASCII/unicode value)
				int kodeHuruf = huruf1;
				String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ','0');
				System.out.println("Kode ASCII dari " + huruf1 + "=" + kodeHuruf);
				System.out.println("kode BINER dari " + huruf1 + "=" + biner1);
				
				// Menggabunkan char menjadi string
				String kata = "" + huruf1 + huruf2 + angka + simbol;
				System.out.println("Gabungan char menjadi string: " + kata);
//
	}

}
