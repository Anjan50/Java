import java.io.*;
class fibonacci
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the limit");
        int n=Integer.parseInt(br.readLine());
        int a=0,b=1,s=0;
        System.out.print(a+","+b);
        for(int i=3;i<=n;i++)
        {
            s=a+b;
            System.out.print(","+s);
            a=b;
            b=s;
        }
    }
}