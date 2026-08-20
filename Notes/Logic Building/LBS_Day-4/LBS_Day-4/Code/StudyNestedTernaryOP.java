class StudyNestedTernaryOP{

	public static void main(String [] args){

		int marks = 95;

		String grade = (marks>=85) ? "A" :(marks>=70) ? "B" : (marks>=55) ? "C" : "F";
	
		System.out.println(grade);
	}
}
