import java.util.Scanner;

class program707
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter String");
        str = sobj.nextLine();

        System.out.println("String is: "+str+" Having length: "+str.length());

        str = str.trim();
        str = str.replaceAll(" ","");
        
        System.out.println("String is: "+str+" Having length: "+str.length());

        sobj.close();

        
    }    
}
