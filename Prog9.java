package arrays;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,6,4,7,9};
		int sum=0;
		for(int i=0;i<arr.length;) {
			if(arr[i]==6) {
				boolean found = false;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==7) {
						i=j+1;
						found=true;
						break;
					}
				}
				if(found==false) {
					sum+=arr[i];
					i++;
				}
			}
			else {
				sum+=arr[i];
				i++;
			}
		}
		System.out.println(sum);

	}

}