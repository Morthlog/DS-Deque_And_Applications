import java.util.Scanner;

public class DNAPalindrome 
{

	public static void main(String[] args) 
	{
		StringDoubleEndedQueue<Character> sequenceQueue= new StringDoubleEndedQueueImpl();
		Scanner keyboard = new Scanner(System.in);	
		String input = keyboard.nextLine();
		
		if(isInputValidAndQueuePopulated(input,sequenceQueue))
		{
			System.out.println("Is palindrome:"+isComplementedPalindrome(sequenceQueue)); 
		}
		else
		{
			System.out.println("Invalid input");
		}
				
		keyboard.close();		
	}
	
	static boolean isComplementedPalindrome (StringDoubleEndedQueue<Character> queue)
	{
		
		if(queue.isEmpty())
		{
			return true;	//returns true, as an empty string is complemented palindrome		
		}
		
		//If odd, there is a central number as complement.E.g AGT!=ACT
		if(queue.size()%2!=0)
		{
			return false;
		}
		//
		while(!queue.isEmpty())
		{
			try 
			{	//compare and reduce the size		
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
		return true;
	}
	
	static boolean isCoupleComplementary(char first,char last)
	{
		return((first=='A' && last=='T') || (first=='T' && last=='A') || (first=='C' && last=='G') || (first=='G' && last=='C'));
	}
	
	static boolean isInputValidAndQueuePopulated(String input, StringDoubleEndedQueue<Character> queue)
	{	
		int length=input.length();
				
		for(int i=0; i<length;i++)
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
