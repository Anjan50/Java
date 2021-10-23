import java.util.Scanner;

public class binary2decimal {
	public static int bin2Dec(String bString) throws NumberFormatException {
		int deci = 0;
		int strLength = bString.length();
		for (int i = 0; i < strLength; i++) {
			if (bString.charAt(i) < '0' || bString.charAt(i) > '1') {
				throw new NumberFormatException("The Input String is not Binary");
			}
			deci += (bString.charAt(i)-'0') * Math.pow(2, strLength-1-i);
		}
		return deci;
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary Value : ");
		String str = sc.nextLine();
		try {
			System.out.println("Value = " + bin2Dec(str));
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}