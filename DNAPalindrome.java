import java.util.Scanner;

public class DNAPalindrome 
{

	public static void main(String[] args) 
	{
		StringDoubleEndedQueue<Character> sequenceQueue= new StringDoubleEndedQueueImpl();
		
		Scanner keyboard = new Scanner(System.in);	
		String input = keyboard.nextLine();
			
		if(isInputValidAndQueuePopulated(input, sequenceQueue))
		{
			System.out.println("Is palindrome:"+ isComplementedPalindrome(sequenceQueue)); 
		}
		else
		{
			System.out.println("Invalid input. Valid input is: uppercase 'A', 'T', 'C', 'G'");
		}
				
		keyboard.close();		
	}
	
	static boolean isComplementedPalindrome (StringDoubleEndedQueue<Character> queue)
	{		
		if(queue.isEmpty())
		{
			return true;	//returns true, as an empty string is a complemented palindrome		
		}
		
		//If odd, the central number of the sequence is always the complement of the initial.E.g AGT!=ACT
		if(queue.size()%2!=0)
		{
			return false;
		}
		
		//
		while(!queue.isEmpty())
		{
			//compare and reduce the size		
			if(!isComplementaryCouple(queue.removeFirst(), queue.removeLast()) )
			{
				return false;
			}							
		}
		return true;
	}
	
	static boolean isComplementaryCouple(char first, char last)
	{
		return((first=='A' && last=='T') || (first=='T' && last=='A') || (first=='C' && last=='G') || (first=='G' && last=='C'));
	}
	
	static boolean isInputValidAndQueuePopulated(String input, StringDoubleEndedQueue<Character> queue)
	{	
		int length= input.length();
				
		for(int i=0; i<length; i++)
		{
			char currentChar=input.charAt(i);
	
			if(currentChar!='A' && currentChar!='T' &&  currentChar!='C' && currentChar!='G')
			{	
				return false;
			}
			queue.addLast(currentChar);				
		}
		return true;
	}
}
