class ReturnDemo{

	public static void calculateNothing(int n){
			if(n<0){
				return;
			}
		System.out.println("Its positive");
		}

	public static void main(String[] args){
		
		
		calculateNothing(5);
	}

}