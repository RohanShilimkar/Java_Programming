import java.util.*;

class DigitX
{

    public int CountEvenDigit(int iNo)
    {
        int iCount=0;
        int iDigit=0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)      
            {
            iCount = iCount+1;
            }

            iNo = iNo / 10;

            
        }      
        return iCount; 
    }

}

class p86
{
    public static void main(String []a)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;

        System.out.print("Enter a Number:");
        iValue = sobj.nextInt();

       int iRet =  dobj.CountEvenDigit(iValue);   

        System.out.println("Number of Even Digits Are:"+iRet);

    }
}