import java.util.Scanner;

public class Palindrome 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String inputNoSpaces = input.replace(" ", "");
				PalindromeCheck(inputNoSpaces);
	}

	private static void PalindromeCheck (String input)
	{
		if (input != null)	
		{
			char[] inputChars = input.toCharArray();
			boolean isPalindrome = true;

			for(int i = 0, j = inputChars.length -1; i < inputChars.length/2; i++, j--)	
			{
				if (inputChars[i] != inputChars [j])
				{
					isPalindrome = false;
							break;
				}
			}
			
			System.out.println(input + " is a palindrome " + isPalindrome);
		}

	}

}
