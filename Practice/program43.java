// type 2

import java.util.*;

class program43
{
    public static boolean CheckDivisible(int iNo)
    {
        if((iNo%3==0) && (iNo%5==0))// microprocessor handle for && operator if 1st is false
            {
                // System.out.println("Divisible by 3 and 5");
                return true;
            }
        else
            {
                // System.out.println("Not Divisible by 3 and 5");
                 return false;
            }


    }

    public static void main(String a[])
    {
       int iValue=  0;
        boolean bRet=false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number:");
        iValue = sobj.nextInt();

        bRet =  CheckDivisible(iValue); 

        if(bRet==true)
        {
            System.out.println("Divisible by 3 and 5");
        }
        else{
            System.out.println("not divisble by 3 and 5");
        }
        
        
           
        
        

    }
}