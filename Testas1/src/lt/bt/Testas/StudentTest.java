package lt.bt.Testas;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("Vardenis", "Pavardenis", "7", new int[] {6,9,10,5,7}, new boolean[] {false, true, true, false, true, false});
		System.out.println(student.getName());
		System.out.println(student.average());
		System.out.println(student.attendance());
	}

}
