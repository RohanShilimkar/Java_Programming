import java.util.Scanner;

class program704
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter String");
        str = sobj.nextLine();

        System.out.println("String is: "+str+" Having length: "+str.length());
        str = str.trim();
        
        System.out.println("String is: "+str+" Having length: "+str.length());

        sobj.close();

    }    
}
