package asas;

import java.io.IOException;
import java.util.Scanner;

public class MainAssignment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String name,lastname;
		 String studentId;
		 float grade1,grade2;
		 float gpa;
		
		
		
		//menu
		
		 System.out.println("to add student information input 1 \n"
					+ "for ALL student information input 2 \n"
					+ "to show the avrage GPA input 3\n"
					);
		 
		 
		 
		 Scanner scann=new Scanner(System.in);
		 switch (scann.nextInt()) {
		 case 1://add student
			 System.out.println("Write student name / last name / student ID / grade1,2");
			 name=scann.next();
			 lastname=scann.next();
			 studentId=scann.next();
			 grade1=scann.nextFloat();
			 grade2=scann.nextFloat();
			 student s=new student();
				if( s.studetnadd()) {
					System.out.println("student added succesfully\ndo you want to add new student?!Y/N");
				}else
					System.out.println("student ID is used");
				break;
		 case 2://all student 
			 
			 student s1=new student();
				s1.allstudent();
				break;
		 case 3://avg gpa 
			 student s2=new student();
				System.out.println(s2.AvgGpa()); 
				break;
				
		 }
		 
		 
		 
		 
	}

}
