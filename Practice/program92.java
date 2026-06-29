import java.util.*;

class DigitX
{

    public int ReverseNumber(int iNo)
    {
        int iSum=0;
        int iDigit=0;
        int iRev=0;
        while(iNo != 0)
        {
            iDigit = iNo%10;
            iRev = (iRev*10)+iDigit;
            iNo = iNo / 10;   
        }      
        return iRev; 
    }

}

class p92
{
    public static void main(String []a)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;

        System.out.print("Enter a Number:");
        iValue = sobj.nextInt();

       int iRet =  dobj.ReverseNumber(iValue);   

        System.out.println("Reverse Number is:"+iRet);

    }
}