class StudySwitchCase{

	public static void main(String args[]){
		
	//calculator
	
	int a = 17;
	int b = 13;

	char choice = '*';

	switch (choice){
		
		case '+': 
			System.out.println(a+b);
			break;
		case '-': 
			System.out.println(a-b);
			break;
		case '*': 
			System.out.println(a*b);
			break;

		case '/': 
			System.out.println(a/b);
			break;
		default : 
			System.out.println("invalid choice");
		}
	}
}




