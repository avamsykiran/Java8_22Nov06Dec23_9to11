import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello World! Welcome To Java 8");
		
		System.out.println("User Name: ");
		String userName = scan.next();
		
		System.out.println("Hello " + userName);
		
		scan.close();
	}

}
