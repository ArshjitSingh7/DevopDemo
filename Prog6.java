package arrays;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,6,8,6,77,22};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for( int x : arr) {
			System.out.print(x+" ");
		}

	}

}
