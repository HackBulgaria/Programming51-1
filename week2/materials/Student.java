package week2;

public class Student {
	public String name;
	public String course;
	public String gender;
	public int id;
	public int[] grades = new int[5];

	public Student() {

	}

	public Student(String name, String course, String gender, int id) {
		this.name = name;
		this.course = course;
		this.gender = gender;
		this.id = id;
	}
	
	public void addGrade(int grade, int index){
		grades[index] = grade;
	}
	
	public String toString() {
		return name + "\n" + course + "\n" + gender + "\n" + id + "\n" + printGrades();
	}
	
	public String printGrades(){
		String str = "";
		for(int i=0; i<5; i++){
			str = str + i +":" + grades[i] + "\n";
		}
		return str;
	}
	
	public boolean isFailing(){
		return averageGrade() < 3;
	}
	
	public void shallIPass(){
		if(isFailing()){
			System.out.println("You shall not pass!");
		}else{
			System.out.println("You pass this course");
		}
	}
	
	public double averageGrade(){
		double sum = 0;
		for(int i=0;i<5;i++){
			sum = sum + grades[i];
		}
		return sum/5;
	}

	
}






