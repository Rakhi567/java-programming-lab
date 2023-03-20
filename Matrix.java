import java.util.Scanner;
class Matrix
{
public static void main(String args[])
{
int row,col,i,j;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of rows");
row=in.nextInt();
System.out.println("Enter the number of column");
col=in.nextInt();
int a[][]=new int[row][col];
int b[][]=new int[row][col];
int c[][]=new int[row][col];
System.out.println("Enter the element of first matrix");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
a[i][j]=in.nextInt();
System.out.println();
}
System.out.println("Enter the elements of second matrix");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
b[i][j]=in.nextInt();
System.out.println();
}
for(i=0;i<row;i++)
for(j=0;j<col;j++)
c[i][j]=a[i][j]+b[i][j];
System.out.println("Sum of matrices are:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
System.out.print(c[i][j]+"\t");
System.out.println();
}
}
}

