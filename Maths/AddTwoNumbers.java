import java.util.Scanner;
public class TwoNumberAdderApi{

    public static void main(String[] args) {
        
        int a, b, ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        a = sc.nextInt();
        
        System.out.println("Enter the Second Number: ");
        b = sc.nextInt();
        
        sc.close();
        ans = a + b;
        System.out.println("Sum of these numbers: "+ans);
    }
}
