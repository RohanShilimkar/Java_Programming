//  Input   : my name is amit school name is abhinav city name is pune
//  Output  : 3  

import java.util.Scanner;

class program749
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
            if(Tokens[i].equals("name"))
            {
                iCount++;
            }
        }

        System.out.println("Frequency of word is: "+iCount);

        
        sobj.close();
         
    }
}