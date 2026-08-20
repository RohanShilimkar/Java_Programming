import java.io.*;
import java.util.Scanner;

class program694
{
    public static void main(String a[]) throws Exception
    {
        int iRet=0;

        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;
        
        System.out.println("Enter Folder Name:");
        FolderName = sobj.nextLine();
        
        System.out.println("Enter the Name of packed file:");
        PackFileName = sobj.nextLine();
        
        File fobjfolder = new File(FolderName);

        if(fobjfolder.exists()  && fobjfolder.isDirectory())
        {
            // System.out.println("Folder Exists");
            File fobjPack = new File(PackFileName);
            
            fobjPack.createNewFile();

            foobj = new FileOutputStream(fobjPack);
        
            // System.out.println("");

            File farr[] = fobjfolder.listFiles();

            byte Buffer[] = new byte[1024];
            
            for(int i=0;i<farr.length;i++)
            {

                fiobj = new FileInputStream(farr[i]);

                System.out.println(farr[i].getName());

                // //Write Filename and size
                // String str =  null;
                // str = farr[i].getName() +" "+ farr[i].length()+ "\n";
                
                // foobj.write(str.getBytes());
                
                // //Loop
                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }

                fiobj.close();
            }
            
            System.out.println("Sucessfully Done!");
        }
        else
            {
                System.out.println("No such Folder");
            }
            
        foobj.close();
        sobj.close();
    }
}

