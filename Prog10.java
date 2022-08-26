package arrays;

public class Prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length!=4) {
			System.out.println("Enter four numbers");
		}
		else {
			int x=0;
			int [][] arr = new int[2][2];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]=Integer.parseInt(args[x++]);
				}
			}
			
			System.out.println("Given array is :  ");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("\n");
			}
			
			int temp = arr[0][0];
			arr[0][0] = arr[1][1];
			arr[1][1] = temp;
			temp = arr[0][1];
			arr[0][1] = arr[1][0];
			arr[1][0] = temp;
			System.out.println("Reverse  array is :  ");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("\n");
			}
		}
	}
}





