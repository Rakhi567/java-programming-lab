public class Rectangle
{
double l,b;
public void setData()
{
l=12.48;
b=13;
}
public void getArea()
{
double Area=l*b;
System.out.println("area is " +Area);
}
public static void main(String args[])
{
Rectangle obj=new Rectangle();
obj.setData();
obj.getArea();
}
}
