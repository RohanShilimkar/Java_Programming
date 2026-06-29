import java.util.*;

class DigitX
{

    public void CountEvenOddDigit(int iNo)
    {
        int iDigit=0;
        int iCountEven=0;
        int iCountOdd=0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)      
            {
            iCountEven = iCountEven + 1;
            }
            else{
                iCountOdd = iCountOdd +1;
            }

            iNo = iNo / 10;

            
        }      

            System.out.println("Even Digits Are: "+iCountEven);
            System.out.println("Odd Digits Are: "+iCountOdd);
    }

}

class p88
{
    public static void main(String []a)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;

        System.out.print("Enter a Number:");
        iValue = sobj.nextInt();

       dobj.CountEvenOddDigit(iValue);   

       
    }
}