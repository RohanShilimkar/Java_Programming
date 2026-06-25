import java.util.*;

class program36
{
    public static void main(String a[])
    {
        int iAge = 0;
        String sName = null;
        float fMarks = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Name:");
        sName = sobj.nextLine();

        System.out.println("Enter your Age:");
        iAge = sobj.nextInt();

        System.out.println("Enter your marks:");
        fMarks = sobj.nextFloat();

        System.out.println("Name:"+sName);
        System.out.println("Age:"+iAge);
        System.out.println("Marks:"+fMarks);



        

    }
}