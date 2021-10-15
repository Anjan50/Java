import java.io.*;
class Armstrong
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        int c=0,x=n;
        while(x>0)
        {
            c++;
            x=x/10;
        }
        int z=n,r,s=0;
        while(z>0)
        {
            r=z%10;
            s=s+(int)Math.pow(r,c);
            z=z/10;
        }
        if(s==n)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}