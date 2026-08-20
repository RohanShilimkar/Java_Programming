import java.io.*;
import java.util.Scanner;

class program728
{
    public static void main(String a[]) throws Exception
    {
        int iRet=0;
        int size=0;
        int i=0;
        int j=0;
        
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;
        String header = "";

        byte Buffer[] = new byte[1024];
        byte Bheader[] = null;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;
        
        System.out.println("Enter Folder Name:");
        FolderName = sobj.nextLine();
        
        System.out.println("Enter the Name of packed file:");
        PackFileName = sobj.nextLine();
        
        File fobjfolder = new File(FolderName);

        if(fobjfolder.exists()  && fobjfolder.isDirectory())
        {
            System.out.println("Folder Exists");

            File fobjPack = new File(PackFileName);
            
            fobjPack.createNewFile();

            foobj = new FileOutputStream(fobjPack);
           
            File farr[] = fobjfolder.listFiles();

            System.out.println("Number of files in Folder: "+farr.length);

            for(i=0;i<farr.length;i++)
            {
                fiobj = new FileInputStream(farr[i]);
                
                header = header + farr[i].getName();
                header = header+" ";
                header = header + farr[i].length();

                size = 100 - header.length();
                for(j=1;j<=size;j++)
                {
                    header = header+" ";
                }

                Bheader = header.getBytes();
                
                // //Write Filename and size

                foobj.write(Bheader);

                //Loop                
                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }

                fiobj.close();
                header = "";
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

