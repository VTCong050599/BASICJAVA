package Lab2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADog adog1 = new ADog("Husky","7","Grey");

		
		System.out.println(adog1.age  + adog1.color  +adog1.name );
		adog1.barking("too much");
	}

}
