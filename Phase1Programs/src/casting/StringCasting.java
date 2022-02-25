//write a program which will take a string as input and will convert it into other primitive data types.
package casting;

import java.util.Scanner;

public class StringCasting {

	public static void main(String[] args) {
		String str;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the string: ");
	str=sc.nextLine();
	int number = Integer.parseInt(str);
    System.out.println("String to integer: "+number);
    double number2 = Double.parseDouble(str);
    System.out.println("String to double: "+number2);
    long number3 = Long.parseLong(str);
    System.out.println("String to long: "+number3);
    boolean bool=Boolean.parseBoolean(str);
    System.out.println("String to boolean: "+bool);
    float f = Float.parseFloat(str);
    System.out.println("String to float: "+f);
	}

}

