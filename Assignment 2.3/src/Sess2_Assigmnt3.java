import java.util.Scanner;

public class Sess2_Assigmnt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, i, j, k, l, spaces = 1;
		int ch = 97;
		Scanner inputReader = new Scanner(System.in);

		System.out.print("Enter the dimension of the diamond : ");
		n = inputReader.nextInt();

		spaces = n - 1;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= spaces; j++) { //To print spaces
				System.out.print(" ");
			}
			spaces--;
			for (k = 1; k <= i; k++){ //To print 1st half of the diamond (vertically)
				System.out.print((char) ch++);
			}
			ch--;
			for (l = 1; l < i; l++){ //To print 2nd half of the diamond (vertically)
				System.out.print((char) --ch);
			}
			System.out.println();
			ch = 97;
		}

		//To print the below half of the diamond
		spaces = 1;
		for (i = 1; i <= (n - 1); i++) { //To print spaces
			for (j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			spaces++;
			for (k = 1; k <= n - i; k++){ //To print 1st half of the diamond (vertically)
				System.out.print((char) ch++);
			}
			ch--;
			for (l = 1; l < n - i; l++){ //To print 2nd half of the diamond (vertically)
				System.out.print((char) --ch);
			}
			System.out.println();
			ch = 97;
		}
	}

}
/*
******************************************************************************
Enter the dimension of the diamond : 3
  a
 aba
abcba
 aba
  a
******************************************************************************
*/