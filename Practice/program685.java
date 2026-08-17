import java.io.*;
import java.util.Scanner;

class program685
{
    public static void main(String a[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        
        System.out.println("Enter Folder Name:");
        FolderName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if(fobj.exists())
        {
            System.out.println("Folder Exists");
        }
        else
        {
            System.out.println("No such Folder");
        }
      
        
    }
}
