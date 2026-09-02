import java.util.Scanner;

class program735
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        String Tokens[] = null;

        System.out.print("Enter String: ");
        str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        Tokens = str.split(" ");

        for(int i=0;i<Tokens.length;i++)
        {
            System.out.println(Tokens[i]+":"+Tokens[i].length());

        }
       
        sobj.close();
         
    }
}