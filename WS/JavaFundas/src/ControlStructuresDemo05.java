import java.util.Scanner;

public class ControlStructuresDemo05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Item Count: ");
		int qty = scan.nextInt();
		System.out.println("Rate: ");
		double rate = scan.nextDouble();
		
		double discount =0;

		if(qty>=100) {
			discount=0.7;
		}else if(qty>=50) {
			discount=0.5;
		}else if(qty>=30){
			discount=0.3;
		}else {
			discount=0.2;
		}
		
		double bill = qty * rate - (qty*rate*discount);
		System.out.println("Please pay: " + bill);
		scan.close();
	}

}
