class TriangleReverse{

	public static void main(String[] args){
		
		int n = 5;

		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){  
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
  
 //i = 1, n= 5 , 5-1+1 , j=1 to 5       *****
//i=2, n=5, 5-2+1, j=1 to 4  	 	****
//i=3, n=5, 5-3+1, j=1 to 3	        ***
