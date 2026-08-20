class StudyVariable{

		//Declared inside a class with the static keyword.
		static String center = "kharghar"; //static/class variable


		//Declared inside a class but outside methods, and without static
		String name; //instance variable

		void display(){
			
			int age = 15;  //local varaible 
					//Declared inside a method, constructor, or block
		 	System.out.println(age);
		}

		public static void main(String args[]){
				
			//StudyVariable.display();
		
			StudyVariable obj1 = new StudyVariable();
			obj1.name="rahul";
			System.out.println(obj1.name);
			System.out.println(obj1.center);	
			
			
			StudyVariable obj2 = new StudyVariable();
			obj2.name="harry";
			obj2.center="delhi";   //changed reference of variable.
			System.out.println(obj2.name);
			System.out.println(obj2.center);	

			
	}

}