//  Input   : india is my country i live in india
//  Output  : Bharat is my country i live in Bharat  

import java.util.Scanner;

class program750
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        String Tokens[] = null;
        int i=0;
        int iCount=0;

        System.out.print("Enter String: ");
        str = sobj.nextLine();

        str = str.trim();
        str.replaceAll("\\s+"," ");

        Tokens = str.split(" ");

        for(i=0;i<Tokens.length;i++)
        {
            if(Tokens[i].equals("india"))
            {
               
            }
        }

        System.out.println("Frequency of word is: "+iCount);

        
        sobj.close();
         
    }
}