import java.io.*;
class Largest_Among_Three
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 numbers");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        if(a>b && b>c)
        {
            System.out.println(a+" is the largest");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is the largest");
        }
        else
        {
            System.out.println(c+" is the largest");
        }
    }
}