class StudyOfOperator{

	public static void main(String args[]){
		
		int a =  10;
		int b = 15;

		

		int sum = a + b;
		int sub = b - a;
		int mul = b * a;
		int dev = b / a;
		int mod = b % a;

 		//arithmetic
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(dev);
		System.out.println(mod);

		//relational
		System.out.println(a == b);
		System.out.println(a != b);

		//compund assignment op
		System.out.println(a+=5);  //a=a+5
		System.out.println(a-=7);  //a=a-7
		System.out.println(a+=b);  //a=a-7
		System.out.println("-----------------------------");

		int x =  20;
		int y = 25;

		//post-increment
		System.out.println("value of x:" + x); //20
		System.out.println("value of y:" + y); //25
		System.out.println(y = x++);  //20   
		System.out.println("New value of x: " + x); //21

		//pre-increment
		System.out.println("value of x:" + x); //21
		System.out.println("value of y:" + y); //20
		System.out.println(y = ++x);  //22   
		System.out.println("New value of x: " + x); //22

	}		
}