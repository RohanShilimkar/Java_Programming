import java.io.*;


class program670
{
    public static void main(String a[]) 
    {
        FileReader frobj = null;
        int iRet = 0;
        char Buffer[] = new char[20];
        try
        {

           frobj =  new FileReader("Demo.txt"); 
           frobj.read(Buffer,3,10);

           System.out.println(Buffer);
           frobj.close();         // imp
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        finally
        {

        }
            
    
    }
}
