import java.util.Scanner;

public class DNAPalindrome 
{

	public static void main(String[] args) 
	{
		StringDoubleEndedQueue<Character> sequenceQueue= new StringDoubleEndedQueueImpl();
		Scanner keyboard = new Scanner(System.in);
		
		String sequence = keyboard.nextLine();
		validateInputAndPopulateQueue(sequence,sequenceQueue);
		System.out.println("Is palindrome? "+isComplementedPalindrome(sequenceQueue)); 
		
		keyboard.close();		
	}
	
	static boolean isComplementedPalindrome (StringDoubleEndedQueue<Character> queue)
	{
		//true afou to empty string theoreitai palindromo
		if(queue.isEmpty())
		{
			queue.printQueue(System.out);
			return true;			
		}
		
		//If length not an even → invalid		
		if(queue.size()%2!=0)
		{
			return false;
		}

		while(!queue.isEmpty())
		{
			try 
			{				
				if( !isCoupleComplementary(queue.removeFirst(), queue.removeLast()) )
				{
					return false;
				}
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
					
		}
		queue.printQueue(System.out);
		return true;
	}
	
	static boolean isCoupleComplementary(char first,char last)
	{
		return((first=='A' && last=='T') || (first=='T' && last=='A') || (first=='C' && last=='G') || (first=='G' && last=='C'));
	}
	
	static void validateInputAndPopulateQueue(String input,StringDoubleEndedQueue<Character> queue )
	{	
		int length=input.length();
				
		for(int i=0; i<length;i++)
		{
			char currentChar=input.charAt(i);
	
			if(currentChar!='A' && currentChar!='T' &&  currentChar!='C' && currentChar!='G')
			{	
				break;
			}
			queue.addLast(currentChar);					
		}
	}
}
