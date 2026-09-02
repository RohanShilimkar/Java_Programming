import java.util.Scanner;

class program734
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
        
        System.out.println("Number of words:"+Tokens.length);
       
        sobj.close();
         
    }
}