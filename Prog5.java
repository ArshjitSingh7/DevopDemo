package arrays;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int small=Integer.MAX_VALUE;
		int smallest=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		int largest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				if(arr[i]<smallest) {
					int temp=smallest;
					smallest=arr[i];
					small=temp;
				}
				else {
					small=arr[i];
				}
			}
			if(arr[i]>large) {
				if(arr[i]>largest) {
					int temp=largest;
					largest=arr[i];
					large=temp;
				}
				else {
					large=arr[i];
				}
			}
	     }
		System.out.println("Largest 2 numbers  are -->" + largest + " " + large);
		System.out.println("Smallest 2 numbers  are -->" + smallest + " " + small);
		
	}

}
