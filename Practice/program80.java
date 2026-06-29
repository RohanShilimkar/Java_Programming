import java.util.*;

class DigitX
{
    public void DisplayDigit(int iNo)
    {
        while(iNo != 0)
        {
            System.out.println(iNo%10);
            iNo = iNo / 10;
        }        
    }

}

class p80
{
    public static void main(String []a)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;

        System.out.print("Enter a Number:");
        iValue = sobj.nextInt();

        dobj.DisplayDigit(iValue);   


    }
}