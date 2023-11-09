import java.util.Scanner;

public class PrefixToInfix 
{
    public static void main(String args[])
    {   
        boolean valid = true;
        int intChar;    //reduce amount of casting
        String a, b, temp;
        StringDoubleEndedQueueImpl <String> myList = new StringDoubleEndedQueueImpl<>();
        Scanner on = new Scanner(System.in);
        System.out.print("Type the numeric expression in in prefix: ");
        char[] expresion = (on.nextLine()).toCharArray();
        int length = expresion.length -1;

        if (((int) expresion[length] >=48 && (int) expresion[length] <=57) && ((int) expresion[length-1] >=48 && (int) expresion[length-1] <=57)) // the expression starts with 2 numbers
        {
            for (int i = length; i>=0; i--)
            {
                intChar = (int) expresion[i];
                
                if (intChar>=48 && intChar<=57) //* is a number
                {
                    myList.addFirst(String.valueOf(expresion[i]));
                }
                else if(intChar == 42 || intChar == 43 || intChar == 45 || intChar == 47) //* is *,+,-,/ 
                {
                    a = myList.getFirst();
                    myList.removeFirst();
                    b = myList.getFirst();
                    myList.removeFirst();
                    temp = "(" + a + expresion[i] + b + ")";
                    myList.addFirst(temp);
                }
                else // invalid characters
                {
                    System.out.println("Invalid characters found");
                    valid = false;
                    break;
                }

            }
        }
        else
        {
            System.out.println("The expression has to end with at least 2 numbers");
            valid = false;
        }

        if (valid)
        {
        System.out.println(myList.getFirst());
        }
    }
}
