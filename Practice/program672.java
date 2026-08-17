import java.io.*;
import java.util.Scanner;


class program672
{
    public static void main(String a[])
    {
       Scanner sobj = new Scanner(System.in);
       File fobj = null;
       FileOutputStream foobj = null;

       System.out.println("Enter File Name:");
       String fname = sobj.nextLine();

        fobj = new File(fname);
        foobj = new FileOutputStream(fobj);

        String data = "Marvellous Infosystems";

        if(fobj.exists())
        {
            foobj.write(data);      //Error
            
        }
        else
        {
            System.out.println("File is not there");

        }





    }
}
