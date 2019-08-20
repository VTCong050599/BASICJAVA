package Lab3;

import java.util.Scanner;

public class Main2 {
	static Employee[] employees;
	public static void main(String[] args) {
	int luaChon=0;
		// TODO Auto-generated method stub
	System.out.println("======Menu======= ");
	System.out.println("1.Create Employee");
	System.out.println("2.Show the exits employee");
	System.out.println("3.Exits");
		do {
			Scanner sinput = new Scanner(System.in);
			System.out.println("Mời bạn chọn tùy chọn");
			luaChon = sinput.nextInt();
			switch(luaChon) {
			case 1 :
				addEmployee();
				reTurn();
				break;
			case 2:
				if (employees == null) {
					System.out.println(" danh sách hiện tại rỗng, mời bạn chọn lại lựa chọn ");
					break;
				} 
				showEmployee();	
				reTurn();
				break;
			case 3: 
//				System.out.println(" thoat yes/no : 0/1");
//				Scanner jinput = new Scanner(System.in);
//				int check = jinput.nextInt();
				break;	
				}
			}while( luaChon != 3 );
	}

	private static void showEmployee() {
		// TODO Auto-generated method stub
		
		for(int i=0;i< employees.length;i++) {
			System.out.println( +employees[i].id +employees[i].name +employees[i].salary +employees[i].job.name );
		}
	}

	public static void addEmployee() {
		Scanner hinput = new Scanner(System.in);
		System.out.println(" nhập số lượng employees cần nhập");
		int soLuong = hinput.nextInt();
		employees = new Employee[soLuong];
		int i;
		for (i=0;i <soLuong;i++) {
			Scanner kinput = new Scanner(System.in);
			System.out.println(" nhap ten nguoi thu " +(i+1));
			String name = kinput.next(); 
			System.out.println(" nhap id thu " + (i+1));
			int id = kinput.nextInt();
			System.out.println(" nhap salary nguoi thu "+ (i+1));
			Double sl = kinput.nextDouble();
			System.out.println(" nhap job nguoi thu " + (i+1));
			String jb = kinput.next();
			Job job = new Job(jb);
			Employee employee =  new Employee(id, name, sl,job);
			employees[i] = employee;
		};
	}
	public static void reTurn() {
		System.out.println("Are you return menu yes/no : 0/1");
		Scanner rinput = new Scanner(System.in);
		int choose = rinput.nextInt();
		if ( choose == 0) {
			System.out.println("======Menu======= ");
			System.out.println("1.Create Employee");
			System.out.println("2.Show the exits employee");
			System.out.println("3.Exits");
		}
	}
}

