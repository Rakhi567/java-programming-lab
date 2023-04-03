import java.util.Arrays;
import java.util.Scanner;
public class Sortstring {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string value: ");
String str = sc.nextLine();
char charArray[] = str.toCharArray();
Arrays.sort(charArray);
System.out.println("the string after sorting is:");
System.out.println(new String(charArray));
}
}
