package arrays;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,10,30,40,50,40,30,10,50};
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
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				arr[i]=0;
			}
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		int n1=arr.length-count;
		int [] arr1 = new int [n1];
		int k=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr1[k++]=arr[i];
			}
		}
		for(int i=0;i<n1;i++) {
			if(i==n1-1) {
				System.out.print(arr1[i]);
			}
			else {
				System.out.print(arr1[i]+",");
			}
			
		}

	}

}
