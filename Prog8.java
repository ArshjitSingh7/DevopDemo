package arrays;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,10,30,40,100,99,20,60,20};
		int num=arr[0];
		int maxCount=1;
		int count=1;
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=1;i<n;i++) {
			if(arr[i-1]==arr[i]) {
				count++;
			}
			else {
				count=1;
			}
			if(count>maxCount) {
				maxCount=count;
				num=arr[i];
			}
		}
		System.out.println(num);
		

	}

}
