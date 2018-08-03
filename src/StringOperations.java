import java.io.*;
import java.util.Scanner;
public class StringOperations
{
	public static void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = in.nextLine();
		System.out.println("Entered string: " + string);
		int words = 1;
		for (int i = 0; i < string.length(); i++)
		{
			if (string.charAt(i)==' ')
				words++;
		}
		System.out.println("Number of characters: "+string.length());
		System.out.println("Number of words: "+words);

		System.out.print("Enter the index of character: ");
		int x=in.nextInt();
		if (x>string.length()-1)
			System.err.println("Index is greater than string size!!!\n");
		else
			System.out.println("Character at string["+x+"] is: "+string.charAt(x));

		System.out.println("Want to increment characters upto 2 successors of an array? Y/N");
		in.nextLine(); //used it to clear the buffer of '\n' (RETURN)
		if(System.in.read()=='y' || System.in.read()=='Y')
		{
			in.nextLine(); //used it to clear the input buffer
			IncrementChar inc = new IncrementChar();
			inc.incrementChar();
		}
		else
		System.exit(0);
	}
}
class IncrementChar
{
	void incrementChar()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = in.nextLine();
		char strInChar[] = str.toCharArray();
		char ch = '\0';
		System.out.print("Characters upto 2nd successor: ");
		for (int i = 0; i <= strInChar.length - 1; i++)
		{
			ch = strInChar[i];
			ch += 2;
			System.out.print(ch);
		}
	}
}