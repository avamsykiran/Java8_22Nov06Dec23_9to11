import java.util.Scanner;

public class ControlStructuresDemo06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Row Count: ");
		int r = scan.nextInt();
		System.out.println("Column Count: ");
		int c = scan.nextInt();
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scan.close();
	}

}
