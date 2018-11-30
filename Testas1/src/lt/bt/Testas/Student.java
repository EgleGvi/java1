package lt.bt.Testas;

public class Student {

	private String name = "";
	private String lastName = "";
	private String class1 = "";
	private int[] gradeArray = null;
	private boolean[] attendanceArray = {true, false};

	
	public Student(String name, String lastName, String class1, int[] gradeArray, boolean[] attendanceArray) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.lastName = lastName;
		this.class1 = class1;
		this.gradeArray = gradeArray;
		this.attendanceArray = attendanceArray;
		
	}
	
	public String getName() {
	    return name;
	}
	
	public String getlastName() {
	    return lastName;
	}
	
	public String getclass1() {
	    return class1;
	}
	
	public int[] getgradeArray( ) {
		return gradeArray;
	}
	
	public boolean[] getattendanceArray( ) {
		return attendanceArray;
	}
	
	public double average() {
		int sum = 0;
		for(int i = 0; i < gradeArray.length; i++ ) {
			sum = sum + gradeArray[i];
		}
		double aver = sum/gradeArray.length;
		
		return aver;
	}
	
	public int attendance() {
		int sum = 0;
		for(int i = 0; i < attendanceArray.length; i++) {
			if(attendanceArray[i] == false) {
				sum++;
			}
		}
		return sum;
	}
}
