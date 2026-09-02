import java.util.Scanner;

class program739
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

        temp = Tokens[0];
        for(int i=0;i<Tokens.length;i++)
        {
            if(Tokens[i].length() > temp.length())
            {
                temp = Tokens[i];
            }
        }
        System.out.println("Largest Word is: "+temp+" having length:"+temp.length());
       
        sobj.close();
         
    }
}