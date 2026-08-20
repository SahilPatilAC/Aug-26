import java.util.Scanner;

class StudyScanner{
		
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your name :");
		String name = sc.nextLine();

		System.out.println("Please enter your age :");
		int age = sc.nextInt();

		System.out.println("Welcome to CDAC, : "+ name);
		System.out.println("Your age is : "+ age);
	}
}

