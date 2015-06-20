package week2;

import week2.CoffeeMachine;
import week2.Coffee;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student kamen = new Student("Kamen","Prog51","male",51);
		//System.out.println(kamen);
		/*
		kamen.addGrade(3,0);
		kamen.addGrade(3,1);
		kamen.addGrade(3,2);
		kamen.addGrade(2,3);
		kamen.addGrade(3,4);
		
		System.out.println(kamen.isFailing());
		kamen.shallIPass();
		System.out.println(3.0 / 2.0);*/
		
		Student [] p51 = new Student[5];
		for(int i=0;i<5;i++){
			p51[i] = new Student("Kamen","Prog51","male",51);
		}
		
		p51[0].name = "Ivan";
		System.out.println(p51[0]);
	}

}
