import java.io.*;


class program669
{
    public static void main(String a[]) 
    {
        FileReader frobj = null;
        int iRet = 0;
        char Buffer[] = new char[10];
        try
        {

           frobj =  new FileReader("Demo.txt"); 
           frobj.read(Buffer);

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
