import java.io.*;
import java.util.Scanner;


class program675
{
    public static void main(String a[])
    {
        String data = "Marvellous Infosystems";
        byte Arr[] = data.getBytes();


        System.out.println(data.length());
        System.out.println(Arr.length);
    
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println((char)Arr[i]);
        }



    }
}
