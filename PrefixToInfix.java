import java.util.Scanner;

public class PrefixToInfix 
{
    public static void main(String args[])
    {   
        boolean valid = true;
        char ch;
        String a, b, temp;
        StringDoubleEndedQueueImpl <String> myList = new StringDoubleEndedQueueImpl<>();
        Scanner on = new Scanner(System.in);
        System.out.print("Type the numeric expression in in prefix: ");
        char[] expresion = (on.nextLine()).toCharArray();
        int length = expresion.length -1;
        on.close();

        if ((expresion[length] >= '0' && expresion[length] <= '9') 
        && (expresion[length-1] >= '0' && (int) expresion[length-1] <= '9')) // the expression starts with 2 numbers
        {
            for (int i = length; i>=0; i--)
            {
                ch = expresion[i];

                if (ch >= '0' && ch <= '9')
                {
                    myList.addFirst(String.valueOf(expresion[i]));
                }
                else if(ch == '*' || ch == '+' || ch == '-' || ch == '/') //* is *,+,-,/ 
                {
                    a = myList.removeFirst();
                    b = myList.removeFirst();
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
