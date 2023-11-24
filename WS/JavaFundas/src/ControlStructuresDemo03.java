import java.util.Scanner;

public class ControlStructuresDemo03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Week Day: ");
		String day = scan.next();

		String status = "";
		
		switch (day.toLowerCase()) {
		case "monday": 
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			status="Working day";
			break;
		case "sunday":
		case "saturday":
			status="WeekOff";
			break;
		default:
			status="UNKNOWN DAY";
		}
		
		System.out.println(day + " is a " +status);
		scan.close();
	}

}
