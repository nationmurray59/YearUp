
public class Loops {

	public static void main(String[] args) 
	{
		int[] numbersArray = new int [] {15, 30, 32, 35 , 45, 47};
		int[] numbersArray2 = new int [] {15, 30, 32, 35, 45, 46};
		int[] numbersArray3 = new int [] {15, 30, 32, 35, 45, 47, 47};
		System.out.println("Searching in array 1 ....");
		FindANumberInArray(numbersArray, 47);
		System.out.println("Searching in array 2 ....");
		FindANumberInArray(numbersArray2, 47);	
		System.out.println("Searching in array 3 ....");
		FindOccuranceInArray(numbersArray3, 47);
	}

	public static void FindANumberInArray(int[] numbers, int searchNumber)
	{
		if (numbers != null)
		{
			int foundAtLocation = -1;

			for (int i = 0; i < numbers.length; i++)
			{
				if (numbers[i] == searchNumber)
				{
					foundAtLocation = i;
					break;
				}
			}

			if (foundAtLocation >= 0)
			{
				System.out.println("The number was found at location " + foundAtLocation);
			}

			else
			{
				System.out.println("The number was not found in the array");
			}
		}
	}

	public static void FindOccuranceInArray(int[] numbers, int searchNumber)
	{
		if (numbers != null)
		{
			int countOfOccurance = 0;

			for (int i = 0; i < numbers.length; i++)
			{
				if (numbers[i] == searchNumber)
				{
					countOfOccurance++;
				}
			}
				System.out.println(searchNumber + " in the array was found " + countOfOccurance + " times.");

		}
	}
}