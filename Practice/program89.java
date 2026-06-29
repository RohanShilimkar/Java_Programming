import java.util.*;

class DigitX
{

    public int SumDigit(int iNo)
    {
        int iSum=0;
        int iDigit=0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum += iDigit;
            iNo = iNo / 10;   
        }      
        return iSum; 
    }

}

class p89
{
    public static void main(String []a)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;

        System.out.print("Enter a Number:");
        iValue = sobj.nextInt();

       int iRet =  dobj.SumDigit(iValue);   

        System.out.println("Summation of Digits Are:"+iRet);

    }
}