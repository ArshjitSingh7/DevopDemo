package arrays;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		float sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		float average=(sum/arr.length);
		System.out.println(sum);
		System.out.println(average);

	}

}
