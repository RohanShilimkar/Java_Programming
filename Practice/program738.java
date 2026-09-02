import java.util.Scanner;

class program738
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        String Tokens[] = null;
        String temp = null;

        System.out.print("Enter String: ");
        str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        Tokens = str.split(" ");

        int max = 0;

        for(int i=0;i<Tokens.length;i++)
        {
            if(Tokens[i].length() >= max)
            {
                max = Tokens[i].length();
                temp = Tokens[i];
            }
        }

        System.out.println("All words with maximum length");

        for(int i=0;i<Tokens.length;i++)
        {
            if(Tokens[i].length() == max)
            {
                System.out.println(Tokens[i]);
            }
        }

        sobj.close();
         
    }
}