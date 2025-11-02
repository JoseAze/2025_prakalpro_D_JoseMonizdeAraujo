package pekan5;

public class tugasNestedfor {

	public static void main(String[] args) {
		int n = 4; 


        System.out.print("#");
        for (int i = 0; i < n * 4; i++) {
            System.out.print("=");
        }
        System.out.println("#");


        for (int i = 1; i <= n; i++) {
            System.out.print("| "); 

            
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }


            System.out.print("<>");


            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(".");
            }

            
            System.out.print("<>");


            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            System.out.println("    |"); 
        }


        for (int i = n - 1; i >= 1; i--) {
            System.out.print("| ");


            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }


            System.out.print("<>");


            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(".");
            }

        
            System.out.print("<>");

            
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            System.out.println("    |");
        }


        System.out.print("#");
        for (int i = 0; i < n * 4; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
}