
public class Main {

	static void main(String[] args)
	{
		Person instructor = new Person("Nation Murray", 20, "4044400440", "730 Peachtree St NE");
		System.out.println("Instructor's name is " + instructor.GetName());
		System.out.println("Instructor's age is " + instructor.GetAge());
		System.out.println("Instructor's phone number is " + instructor.GetphoneNumber());
		System.out.println("Instructor's adress is" + instructor.GetAddress());
		System.out.println("It is June 24, 2015 today");
		instructor.GrowsOlder();
		System.out.println("instructor's age is now " + instructor.GetAge());
		
	}
}
