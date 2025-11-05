package pekan6_2511538002;
import java.util.Scanner;
import java.util.Random;

public class GamePenjumlahan_2511538002 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		Random rand = new Random();
		// play until user gets 3 wrong
		int points = 0;
		int wrong = 0;
		while (wrong < 3) {
			int result = play(console, rand); //play one game 
			if (result > 0 ) {
				points++;
			} else {
				wrong++;
			}
		}
		System.out.println("you earned" + points + " Total points.");
	}
	// membuat soal penjumlahan dan ditampilkan ke user
	public static int play(Scanner console, Random rand) {
		int operands = rand.nextInt(4) + 2;
		int sum =rand.nextInt(10)+1;
		System.out.print(sum);
				for(int i=2; i <=operands; i++) {
					int n = rand.nextInt(10) + 1;
					sum += n;
					System.out.print(" + " + n);
				}
					System.out.print(" = ");
					
					int guess = console.nextInt();
					if (guess == sum) {
						return 1;
					}else {
						System.out.println("wrong! the answer was " + sum);
						return 0;
					}
		}
	}
