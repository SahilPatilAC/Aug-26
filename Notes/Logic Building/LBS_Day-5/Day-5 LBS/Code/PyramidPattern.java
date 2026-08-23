class PyramidPattern{

	public static void main(String args[]){
		
		int n = 5;
		
		//for outer loop
		for(int i = 1; i<=n; i++){

			//for space				
			for(int j=1; j<=n-i; j++){			//j<=3 
				System.out.print(" ");
			}
			
			//for star
			for(int j=1; j <=2*i-1  ;j++){     //j<=2*2-1==3
 				System.out.print("*");

			}
		System.out.println();
		}
	}

}    

