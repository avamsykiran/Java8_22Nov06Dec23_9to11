import java.util.Scanner;

public class ControlStructuresDemo08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean shallContinue = true;

		while (shallContinue) {

			System.out.println("Operand1: ");
			int op1 = scan.nextInt();
			System.out.println("Operand2: ");
			int op2 = scan.nextInt();
			System.out.println("What to compute? ");
			String operation = scan.next();

			double result = 0;

			switch (operation) {
			case "sum":
				result = op1 + op2;
				break;
			case "difference":
				result = op1 - op2;
				break;
			case "product":
				result = op1 * op2;
				break;
			case "quitiont":
				result = op1 / op2;
				break;
			case "reminder":
				result = op1 % op2;
				break;
			default:
				System.out.println("Not a valid operation");
				System.out.println("Let's Try again");
				continue;
			}
			
			System.out.println(operation +" of "+op1+" and "+op2+" is "+result);
			
			System.out.println("Do you want to continue? ");
			shallContinue = scan.nextBoolean();
		}
		
		scan.close();
	}

}
