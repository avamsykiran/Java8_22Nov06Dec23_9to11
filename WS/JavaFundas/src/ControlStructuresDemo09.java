import java.util.Random;
import java.util.Scanner;

public class ControlStructuresDemo09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Random random = new Random();
		
		System.out.println("The number of elements: ");
		int size = scan.nextInt();
		
		//int nums[] = new int[size];
		int[] nums = new int[size];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = random.nextInt(100);
			System.out.println(nums[i]);
		}
		
		int sum=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		/*for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			if(min>nums[i]) {
				min=nums[i];
			}
			if(max<nums[i]) {
				max=nums[i];
			}
		}*/
		
		for(int num:nums) {
			sum += num;
			if(min>num) {
				min=num;
			}
			if(max<num) {
				max=num;
			}
		}
		
		System.out.println("Sum: "+sum);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		scan.close();
	}

}
