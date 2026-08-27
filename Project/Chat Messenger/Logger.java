import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger
{
    public static void WriteLog(String message)
    {
        try
        {
            FileWriter fobj = new FileWriter("ChatLog.txt", true);

            Date dobj = new Date();

            fobj.write(message+"\n");
            fobj.write("[" + dobj + "]\n");


            fobj.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to write log");
        }
    }

    public static String getData()
    {
        String Message="";
        try
        {
            FileInputStream fis = new FileInputStream("ChatLog.txt");

            int data = 0;

            while((data = fis.read())!=-1)
            {
                Message = Message + (char)data;
            }

            fis.close();

        }
        catch(IOException e)
        {
            System.out.println("Unable to read data");
        }

        return Message;
    }
}