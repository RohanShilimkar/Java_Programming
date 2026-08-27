import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server application is running...");

        ServerSocket ssobj = new ServerSocket(2100);

        System.out.println("Server is waiting at port 2100");

        Socket sobj = ssobj.accept();
        
        Logger.WriteLog("Client Online");

        System.out.println("Client request gets accepted succesfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("-------------------------------------------");
        System.out.println("--------- Marvellous Chat Server ----------");
        System.out.println("-------------------------------------------");
    
        String str1 = null, str2 = null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("Client says : "+str1);
            Logger.WriteLog("Client : "+str1);

            System.out.println("Enter message for client : ");
            str2 = bobj2.readLine();

            pobj.println(str2);
        }
        Logger.WriteLog("Client Offline");

         
        System.out.println("See chats(Yes/No)");
        if(bobj2.readLine().equalsIgnoreCase("Yes"))
        {
            String messString =  Logger.getData();
            System.out.println("Prevous Messages");
            System.out.println(messString);
        }

        sobj.close();
        ssobj.close();
    }
}