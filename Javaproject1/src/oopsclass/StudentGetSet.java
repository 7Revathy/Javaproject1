package oopsclass;

import inheritancep.GetSetStudentDetails;

public class StudentGetSet {
	String address;
	public static void main(String[] args) {
		StudentGetSet sc= new StudentGetSet();
		sc.address= "Home Address";
		sc.printStudentDetails();
	}
void printStudentDetails()
{
	GetSetStudentDetails student=new GetSetStudentDetails();
	student.setStudentname("Revathy");
	student.setRollnumber(10);
	System.out.println(student.getStudentname());
	System.out.println(student.getRollnumber());	
	System.out.println(address);
}
}
