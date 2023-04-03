import java.util.Scanner; 
import java.util.Arrays;  
public class Sort 
{  
public static void main(String args[])   
{  
int n;
String temp;
Scanner s = new Scanner(System.in);
System.out.print("enter number of names you want to sort:");
n=s.nextInt();
String names[]=new String[n];
Scanner s1=new Scanner(System.in);
System.out.println("enter each name you want to enter:");
for(int i=0;i<n;i++)
{
names[i]=s1.nextLine();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if (names[i].compareTo(names[j])>0)
{
temp=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
System.out.print("Names in sorted order:\n");
for(int i=0;i<n-1;i++)
{
System.out.print("\n"+names[i] +"\n");
}
System.out.print(names[n-1]);
}
}


