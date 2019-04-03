package asas;

import java.io.*;
import java.util.*;

import com.sun.jdi.connect.spi.Connection;
public class student extends Connection {
	private String name,lastname;
	private String studentId;
	private float grade1,grade2;
	private float gpa;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String surname) {
		this.lastname = surname;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public float getGrade1() {
		return grade1;
	}
	public void setGrade1(float grade1) {
		this.grade1 = grade1;
	}
	public float getGrade2() {
		return grade2;
	}
	public void setGrade2(float grade2) {
		this.grade2 = grade2;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	String f="f.txt";
	String tempf="f_temp.txt";
	File file=new File(f);
    
	public student()
	{}
	public  student(String name,String lastname,String studentId,float grade1,float grade2,float gpa) throws IOException 
	{
		
		this.name=name;
		this.lastname=lastname;
		this.grade1=grade1;
		this.studentId=studentId;
		this.grade2=grade2;
		this.gpa=(this.grade1+this.grade2)/2;
		
	}
	
	
	public Boolean studetnadd () throws IOException {
		//add student
	
		File add = new File(f);
		BufferedReader reader = new BufferedReader(new FileReader(add));
		String checkif = studentId;
		String Line;
		
		while((Line = reader.readLine()) != null) {
			 String[] parts =Line.split(" ");
			if(parts[0].equals(checkif)) 
		    {
		    	reader.close();
		    	return false;
		}
			else {
				PrintWriter p=new PrintWriter(new FileWriter(file,true));
				p.println(studentId+" "+name+" "+lastname+" "+grade1+" "+grade2);
				p.close();
				reader.close();
				return true;
			}
		
	}
		reader.close();
		return null;
	
}
	//print out all
	public void allstudent() throws IOException
{
	Scanner scan=new Scanner(file);
	while(scan.hasNextLine())
		System.out.println(scan.nextLine());
	scan.close();
}
	

	public double AvgGpa() throws FileNotFoundException
	{//method to avg gpa 
		Scanner scan=new Scanner(file);
		String[] a;
		double GPAa=0;
		int count=0;
		while(scan.hasNextLine())
		{
			a= scan.nextLine().split(" ");
			GPAa+=(Double.parseDouble(a[3])+Double.parseDouble(a[4]))/3;
			count ++;
		}scan.close();
	
		
		return GPAa/count;

	}
	@Override
	public byte[] readPacket() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void writePacket(byte[] pkt) throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
	
