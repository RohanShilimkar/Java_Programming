import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class program732{

    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String PackFileName = null;
        File fpackobj = null;
        FileInputStream  fiobj = null;
        byte Header[] = new byte[100];
        String strheader = null;
        String tokens[] = null;
        File NewFile = null;
        FileOutputStream foobj = null;
        byte Buffer[] = null;
        int iRet=0;

        System.out.println("Enter the pack file name");

        PackFileName = sobj.nextLine();

        fpackobj = new File(PackFileName);

        if(fpackobj.exists())
        {
            fiobj = new FileInputStream(fpackobj);

            while(((iRet = fiobj.read(Header,0,100))) != -1)
            {

            strheader  = new String(Header);

            // System.out.println("Header is: "+strheader);

            strheader = strheader.trim();

            strheader = strheader.replaceAll("\\s+"," ");

            tokens =strheader.split(" ");
            System.out.println("FileName:"+tokens[0]);
            System.out.println("FileName:"+tokens[1]);


            NewFile = new File(tokens[0]);
            NewFile.createNewFile();


            foobj = new FileOutputStream(NewFile);

            Buffer = new byte[Integer.parseInt(tokens[1])];

            //read data

            fiobj.read(Buffer,0,Integer.parseInt(tokens[1]));


            foobj.write(Buffer,0,Integer.parseInt(tokens[1]));
            
            }


        }
        else
        {

        }
        
    }
    
}
