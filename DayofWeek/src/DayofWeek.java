
import java.util.Scanner;

public class DayofWeek {

	public static void main(String[] args)
	{
	System.out.println("Enter the day of te week:");
	Scanner sc = new Scanner(System.in);
	String dayOfWeek = sc.nextLine();
	EvaluateDayOfWeek(dayOfWeek);

	}

	public static void EvaluateDayOfWeek(String dayOfWeek)
	{
		if (dayOfWeek != null)
		{
			if (!dayOfWeek.isEmpty())
			{
				if (dayOfWeek.equalsIgnoreCase("Monday") ||
					dayOfWeek.equalsIgnoreCase("Tuesday") ||
					dayOfWeek.equalsIgnoreCase("Wednesday") ||
					dayOfWeek.equalsIgnoreCase("Thursday") ||
					dayOfWeek.equalsIgnoreCase("Friday"))
					{
					System.out.println(dayOfWeek + " is a weekday!");
					}
				else if (dayOfWeek.equalsIgnoreCase("Saturday") ||
						dayOfWeek.equalsIgnoreCase("Sunday"))
				{
					System.out.println(dayOfWeek + " is a weekend day!");
				}
			}
		else
		{
			System.out.println("Day of week is an empty string!!");
		}
}
	else
	{
		System.out.println("You have given me a null string!!");
	}
}

}