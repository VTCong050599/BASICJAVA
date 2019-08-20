package Lab3;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Job job1 = new Job("HR");
//		Job job2 = new Job("BR");
//		Job job3 = new Job("tester");
//		Job job4 = new Job("Develop");
//		Job job5 = new Job("CEO");
		Scanner input = new Scanner(System.in);
		// nhap nguoi thu 1
		System.out.println(" mời bạn nhập id người thứ 1");
		int id1 = input.nextInt();
		System.out.println(" mời bạn nhập tên người thứ 1");
		String myName1 = input.next();
		System.out.println(" mời bạn nhập salary người thứ 1");
		double salary1 = input.nextDouble();
		System.out.println(" mời bạn nhập job người thứ 1");
		String jb1 = input.next();
		Job job1 = new Job(jb1);
		
		// nguoi thu 2
		
		System.out.println(" mời bạn nhập id người thứ 2");
		int id2 = input.nextInt();
		System.out.println(" mời bạn nhập tên người thứ 2");
		String myName2 = input.next();
		System.out.println(" mời bạn nhập salary người thứ 2");
		double salary2 = input.nextDouble();
		System.out.println(" mời bạn nhập job người thứ 2");
		String jb2 = input.next();
		Job job2 = new Job(jb2);
		// nguoi thu 3
		
		System.out.println(" mời bạn nhập id người thứ 3");
		int id3 = input.nextInt();
		System.out.println(" mời bạn nhập tên người thứ 3");
		String myName3 = input.next();
		System.out.println(" mời bạn nhập salary người thứ 3");
		double salary3 = input.nextDouble();
		System.out.println(" mời bạn nhập job người thứ 3");
		String jb3 = input.next();
		Job job3 = new Job(jb3);
		
			// nguoi thu 4
		System.out.println(" mời bạn nhập id người thứ 4");
		int id4 = input.nextInt();
		System.out.println(" mời bạn nhập tên người thứ 4");
		String myName4 = input.next();
		System.out.println(" mời bạn nhập salary người thứ 4");
		double salary4 = input.nextDouble();
		System.out.println(" mời bạn nhập job người thứ 4");
		String jb4 = input.next();
		Job job4 = new Job(jb4);
		// nguoi thu 5
		System.out.println(" mời bạn nhập id người thứ 5");
		int id5 = input.nextInt();
		System.out.println(" mời bạn nhập tên người thứ 5");
		String myName5 = input.next();
		System.out.println(" mời bạn nhập salary người thứ 5");
		double salary5 = input.nextDouble();
		System.out.println(" mời bạn nhập job người thứ 5");
		String jb5 = input.next();
		Job job5 = new Job(jb5);
		
		Employee employee1 = new Employee(id1,myName1,salary1,job1);
		//Employee employee1 = new Employee(2,"Nguyen Van B",3000,new Job("HR"));
		Employee employee2 = new Employee(id2,myName2,salary2,job2);
		Employee employee3 = new Employee(id3,myName3,salary3,job3);
		Employee employee4 = new Employee(id4,myName4,salary4,job4);
		Employee employee5 = new Employee(id5,myName5,salary5,job5);
		
		
//		
//		System.out.println(employee1.id);
//		System.out.println(employee1.name);
//		System.out.println(employee1.salary);
//		System.out.println(employee1.job.name);
//		
//		
//		
//		
		
		
		Employee[] employees = new Employee[5];
		employees[0]= employee1;
		employees[1]= employee2;
		employees[2]= employee3;
		employees[3]= employee4;
		employees[4]= employee5;
		//System.out.println(employees.length);
		// đây là in ra size mảng
//		int length = employees.length;
//		System.out.println(employees[length-1].id);
//		System.out.println(employees[length-1].name);
//		System.out.println(employees[length-1].salary);
//		System.out.println(employees[length-1].job.name);


//		
//		System.out.println(" nhap 2 so a ,b");
//		int a = input.nextInt();
//		int b = input.nextInt();
//		System.out.println( +(a+b));
//		System.out.println( +(a-b));
//		System.out.println( +(a%b));
//		System.out.println( +(a/b));
//		System.out.println( +(a++));
//		System.out.println( +(b--));
		int i=0;
		int Length = employees.length;
		for (i=0;i<=Length;i++) {
			System.out.println(employees[i].id);
			System.out.println(employees[i].name);
			System.out.println(employees[i].salary);
			System.out.println(employees[i].job.name);
		}
		
	}

}
