import java.io.*;
import java.util.Scanner;

class program662
{
    public static void main(String a[]) 
    {

        File fobj  = null;
        boolean bRet = false;
        String fname = null;
        Scanner sobj =null;

        sobj = new Scanner(System.in);
        
        System.out.println("Enter FileName:");
        fname = sobj.nextLine();
        
        try
        {
            fobj = new File(fname);
            
            bRet = fobj.exists(); 
            if(bRet == true)
            {
                fobj.delete();
                System.out.println("File gets deleted");
            }
            else
            { 
                System.out.println("No Such File ");
            }
            
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}
