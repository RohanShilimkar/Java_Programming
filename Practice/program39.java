// type 1

import java.util.*;

class program39
{
    public static void main(String a[])
    {
       int iValue=  0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number:");
        iValue = sobj.nextInt();

        
        
            if((iValue%3==0) && (iValue%5==0))//  microprocessor handle for && operator if 1st is false
            {
                System.out.println("Divisible by 3 and 5");
            }
            else
            {
                System.out.println("Not Divisible by 3 and 5");
            }
        
        

    }
}