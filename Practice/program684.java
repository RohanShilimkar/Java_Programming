import java.io.*;
import java.util.Scanner;


class program684
{
    public static void main(String a[]) throws Exception
    {
       Scanner sobj = new Scanner(System.in);
       File fobjSrc = null;
       File fobjDest = null;
       FileInputStream fiobj = null;
       FileOutputStream foobj = null;
       int iRet = 0;

       System.out.println("Enter Source File Name:");
       String fnameSrc = sobj.nextLine();

       System.out.println("Enter Destination File Name:");
       String fnameDest = sobj.nextLine();

        fobjSrc = new File(fnameSrc);
        fobjDest = new File(fnameDest);

        fiobj = new FileInputStream(fnameSrc);
        foobj = new FileOutputStream(fnameDest);

        byte Buffer[] = new byte[100];

        if(fobjSrc.exists())
        {
            String str  = null;
            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);

            }
            
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("File is not there");

        }
    }
}
