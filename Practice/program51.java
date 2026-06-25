import java.util.Scanner;

class NumberX
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                 iSum = iSum + iCnt;
                 
            }
            if(iSum>iNo)
                 {
                    break;
                 }
        }
        if(iSum==iNo){
            return true;

        }
        else{
           return false;
        }
             
    }
     
}

class program51
{
 

    public static void main(String a[])
    {
       int iValue = 0;
        boolean bRet =false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number:");
        iValue = sobj.nextInt();   
        
        NumberX nobj = new NumberX();
        
        bRet = nobj.CheckPerfect(iValue);

        if(bRet==true){
            System.out.println("It is perfect:");
        }
        else{
            System.out.println("Not perfect");
        }

        
        
    }
} 