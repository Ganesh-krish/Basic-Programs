public class Reverse2
{
    public static void main (String[]args)
    {

        //variables initialization
        int num = 1234, reverse = 0, rem;


        //loop to find reverse number
        for( ;num != 0; num = num/10)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
        };

        //output
        System.out.println ("Reversed Number: " + reverse);
    }
}