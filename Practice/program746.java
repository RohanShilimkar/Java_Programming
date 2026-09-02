//  Input   : my name is amit
//  Output  :ym eman si tima 

import java.util.Scanner;

class program746
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

        StringBuffer sb = null;
        StringBuffer FinalStr = null;

        for(i=0;i<Tokens.length;i++)
        {
            sb = new StringBuffer(Tokens[i]);
            System.out.println(sb.reverse());
            FinalStr = sb.append(sb);
        }
        
       System.out.println(FinalStr);

      
        sobj.close();
         
    }
}