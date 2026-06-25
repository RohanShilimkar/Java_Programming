import java.util.*;

class NumberX
{
    public void SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt=1;iCnt<=(iNo/2);iCnt++){
            if((iNo%iCnt)==0)
            {
                 iSum = iSum + iCnt;
            }
        }
                System.out.println("Summation of Factors"+iSum);
    }
     
}

class program48
{
 

    public static void main(String a[])
    {
       int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number:");
        iValue = sobj.nextInt();   
        
        NumberX nobj = new NumberX();
        
        nobj.SumFactors(iValue);
        
        
    }
} 