package Lab3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employees[] = new Employee[5];
		Scanner input = new Scanner(System.in);
		int i=0;
		do{
			System.out.println(" nhap ten nguoi thu" +(i+1));
			String name = input.next(); 
			name = employees[i].name;
//			System.out.println(" nhap id thu " +(i+1));
//			int id = input.nextInt();
//			employees[i].id = id;
//			System.out.println(" nhap salary nguoi thu" +(i+1));
//			Double sl = input.nextDouble();
//			employees[i].salary = sl;
//			System.out.println(" nhap job nguoi thu " + (i+1));
//			String jb = input.next();
//			employees[i].job.name = jb;
			i++;
		} while (i<=3);
	}

}
