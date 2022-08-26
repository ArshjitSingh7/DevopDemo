package arrays;
import java.util.Scanner;
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,2,3,4,5,6};
		System.out.println("Enter the number to be searched");
		int num = sc.nextInt();
		int ans=0;
		boolean isThere = false;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				ans=i;
				isThere=true;
				break;
			}
		}
		if(isThere) {
			System.out.println(ans);
		}
		else {
			System.out.println(-1);
		}
		sc.close();

	}

}
