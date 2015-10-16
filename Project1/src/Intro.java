
public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("My name is Nation.");
System.out.println("My favorite book is Green Eggs and Ham.");
System.out.println("I played football, basketball, and ran cross country.");
Add();
Add(6, 8);

	}	

	public static void Add()
	{
		int a = 5;
		int b = 6;
				int sum = a + b;
		System.out.println("Sum is " + sum);
		
	}
	
public static void Add(int a, int b)
{
	int sum = a + b;
	System.out.println("Sum with inputs is " + sum);
}
}
