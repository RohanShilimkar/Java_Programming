import java.io.*;
import java.util.Scanner;


class program689
{
    public static void main(String a[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        
        System.out.println("Enter Folder Name:");
        FolderName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if(fobj.exists()  && fobj.isDirectory())
        {
            System.out.println("Folder Exists");

            File farr[] = fobj.listFiles();

            for(int i=0;i<farr.length;i++)
            {
              
                System.out.println("Name of Files: "+farr[i].getName());
                System.out.println(farr[i].length());

            }

        }
        else
        {
            System.out.println("No such Folder");
        }
      
        
    }
}
