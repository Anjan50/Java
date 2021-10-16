import java.io.*;
class Palindrome
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        int z=n,r,rev=0;
        while(z>0)
        {
            r=z%10;
            rev=rev*10+r;
            z=z/10;
        }
        if(rev==n)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a Palindrome number");
        }
    }
}