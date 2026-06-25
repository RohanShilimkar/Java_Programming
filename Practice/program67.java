
import java.util.Scanner;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;
        

        for(iCnt=2;iCnt<=(iNo/2);iCnt++)
        {
            if((iNo%iCnt)==0)
            {
              return false;     // Bad Programming
                 
            }

           return true;
        }
    }
     
}

class p67
{
     public static void main(String a[])
    {
       int iValue = 0;
        boolean bRet =false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number:");
        iValue = sobj.nextInt();   
        
        NumberX nobj = new NumberX();
        
        bRet = nobj.CheckPrime(iValue);

        if(bRet==true){
            System.out.println("It is prime");
        }
        else{
            System.out.println("Not prime");
        }

        
        
    }
} 