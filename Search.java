import java.util.*;
class Search{
public static void main(String args[])
{
int size, i, num, f=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array:");
size=sc.nextInt();
int a[]=new int[100];
System.out.println("enter the array elements:");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the number you want to search:\n");
num=sc.nextInt();
for(i=0;i<size;i++)
{
if(num==a[i])
{
System.out.println("the position is:"+i);
f=1;
break;
}
}
if(f==0)
System.out.println("not found");
}
}

