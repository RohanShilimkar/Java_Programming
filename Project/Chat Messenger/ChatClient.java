import java.io.*;
import java.net.*;

class ChatClient
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client application is running...");

        Socket sobj = new Socket("localhost",2100);
        
        Logger.WriteLog("Server Online");
    
        System.out.println("Connection is succesful with server");
   
        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("-------------------------------------------");
        System.out.println("--------- Marvellous Chat Client ----------");
        System.out.println("-------------------------------------------");
    
        String str1 = null, str2 = null;

        System.out.println("Enter message for server : ");

        while(!(str1 = bobj2.readLine()).equals("end"))
        {
            pobj.println(str1);
            Logger.WriteLog("Client says: "+str1);

            str2 = bobj1.readLine();
            
            System.out.println("Server : "+str2);
            Logger.WriteLog("Server Says: "+str2);

            System.out.println("Enter message for server : ");
        }

        Logger.WriteLog("Server Offline");
        
        System.out.println("See chats(Yes/No)");

        if(bobj2.readLine().equalsIgnoreCase("Yes"))
        {
            String messString =  Logger.getData();

            System.out.println("Prevous Messages");
            System.out.println(messString);
        }
        sobj.close();
    }
}