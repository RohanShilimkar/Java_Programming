// type 3

import java.util.*;

class NumberX
{
       public static boolean CheckDivisible(int iNo)
    {
        if((iNo%3==0) && (iNo%5==0))
            {
                return true;
            }
        else
            {
                // System.out.println("Not Divisible by 3 and 5");
                 return false;
            }


    }
}

class program44 
{
 

    public static void main(String a[])
    {
       int iValue=  0;
        boolean bRet=false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number:");
        iValue = sobj.nextInt();

        bRet = NumberX.CheckDivisible(iValue); 

        if(bRet==true)
        {
            System.out.println("Divi/ṇsible by 3 and 5");
        }
     else{
            System.out.println("not divisble by 3 and 5");
        }
        
        
           
        
        

    }
} 