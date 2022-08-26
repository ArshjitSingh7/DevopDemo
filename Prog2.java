package arrays;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		int minValue=Integer.MAX_VALUE;
		int maxValue=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
	     }
		System.out.println(minValue +" "+ maxValue);

  }
}
