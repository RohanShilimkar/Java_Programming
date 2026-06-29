import java.util.*;

class DigitX
{
    public int SumEvenDigit(int iNo)
    {
        int iSum=0;
        int iDigit=0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            if(iDigit % 2 == 0)
            {
                iSum += iDigit;
            }
            iNo = iNo / 10;
        }      
        return iSum; 
    }
}

class p90
{
    public static void main(String []a)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;

        System.out.print("Enter a Number:");
        iValue = sobj.nextInt();

       int iRet =  dobj.SumEvenDigit(iValue);   

        System.out.println("Summation of Even Digits Are:"+iRet);

    }
}