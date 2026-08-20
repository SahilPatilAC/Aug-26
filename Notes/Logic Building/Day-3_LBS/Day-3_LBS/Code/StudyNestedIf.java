class StudyNestedIf{

	public static void main(String args[]){
		int age = 20;
		int weight = 40;

		if(age>=18){
			if(weight>=50){
				System.out.println("Allowed to donate blood");
			}
			else{
				System.out.println("Weight is below 50");
			}
		
		}
		else{
			System.out.println("Not allowed to donate blood");
		}
	}
}