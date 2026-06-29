import java.util.*;

class DigitX
{

    public int CountDigit(int iNo)
    {
        int iCount=0;
        int iDigit=0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount = iCount+1;
            iNo = iNo / 10;
            
        }      

        return iCount; 
    }

}

class p83
{
    public static void main(String []a)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;

        System.out.print("Enter a Number:");
        iValue = sobj.nextInt();

       int iRet =  dobj.CountDigit(iValue);   

        System.out.println("Number of Digits Are:"+iRet);

    }
}