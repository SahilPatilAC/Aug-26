class MethodCall{


	void taxCalculate(){
		System.out.println("Your tax is calculated");
	}

	void salaryCalculate(){
		System.out.println("Your salary is calculated");
	}

	public static void main(String[] args){
		
		MethodCall objCal = new MethodCall();
		objCal.salaryCalculate();
		objCal.taxCalculate();		
		}
}