//  Input   : india is my country i live in india
//  Output  : Bharat is my country i live in Bharat  

import java.util.Scanner;

class program751
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        String Tokens[] = null;
        int i=0;
    
        
        System.out.print("Enter String: ");
        str = sobj.nextLine();

        str = str.trim();
        str.replaceAll("\\s+"," ");

        Tokens = str.split(" ");

        StringBuffer FinalStr = new StringBuffer("");

        for(i=0;i<Tokens.length;i++)
        {
            if(Tokens[i].equals("india"))
            {
                FinalStr = FinalStr.append("bharat");
                FinalStr  = FinalStr.append(" ");

                continue;
            }

            FinalStr = FinalStr.append(Tokens[i]);
        }

        String Output = new String(FinalStr);

        Output = Output.trim();

        System.out.println(Output);
        
        sobj.close();
         
    }
}