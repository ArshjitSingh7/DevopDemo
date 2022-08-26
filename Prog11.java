package arrays;

public class Prog11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=9) {
			System.out.println("Enter nine numbers");
		}
		else {
			int [][] arr = new int[3][3];
			int x=0;
			int maxValue = Integer.MIN_VALUE;
			System.out.println("Given array is :  ");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					
					arr[i][j] = Integer.parseInt(args[x++]);
					if(arr[i][j]>maxValue) {
						maxValue=arr[i][j];
					}
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("\n");
			}
			System.out.println("Biggest number int the array is :" + maxValue);
		}

	}

}
