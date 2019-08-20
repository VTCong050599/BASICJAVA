package basic;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(" Date",6," Boy");
		Student student2 = new Student(" Join",7," Boy");
		Student student3 = new Student(" July",6," Girl");
		System.out.printf("Student1 "+ student.name);
		System.out.printf(student.as);
		System.out.print(student.age);
		System.out.printf("Student2 "+ student2.name);
		System.out.printf(student2.as);
		System.out.print(student2.age);
		System.out.printf("Student3 "+ student3.name);
		System.out.printf(student3.as);
		System.out.print(student3.age);
	}

}
