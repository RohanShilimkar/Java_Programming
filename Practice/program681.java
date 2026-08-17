import java.io.*;
import java.util.Scanner;


class program681
{
    public static void main(String a[]) throws Exception
    {
       Scanner sobj = new Scanner(System.in);
       File fobj = null;
       FileInputStream fiobj = null;

       System.out.println("Enter File Name:");
       String fname = sobj.nextLine();

        fobj = new File(fname);
        fiobj = new FileInputStream(fobj);

        byte Buffer[] = new byte[50];
        int iRet = 0;

        if(fobj.exists())
        {
            String str  = null;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer);
                System.out.print(str);
            }      
            str = null;
        }
        else
        {
            System.out.println("File is not there");

        }




    }
}
