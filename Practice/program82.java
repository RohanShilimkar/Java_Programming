import java.util.*;

class DigitX
{
    public int iDigit=0;

    public void DisplayDigit(int iNo)
    {
        // while(iNo != 0)
        // {
        //     iDigit = iNo % 10;
        //     System.out.println(iDigit);
        //     iNo = iNo / 10;
        // } 


        for(;iNo!=0;iNo = iNo /10)
        {
            iDigit = iNo %10;
            System.out.println(iDigit);
            
        }       
    }

}

class p82
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