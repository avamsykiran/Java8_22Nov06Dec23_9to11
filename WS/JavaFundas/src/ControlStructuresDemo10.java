import java.util.Scanner;

public class ControlStructuresDemo10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("The number of elements: ");
		int size = scan.nextInt();

		String[] friends = new String[size];

		System.out.println("Enter Friends Names: ");
		for (int i = 0; i < friends.length; i++) {
			friends[i] = scan.next();
		}

		/*
		 * for(String f : friends) { System.out.println("Hello "+f); }
		 */

		for (int i = 0; i < friends.length; i++) {
			System.out.println((i % 2 == 0 ? "Hello " : "Hai ") + friends[i]);
		}

		scan.close();
	}

}
