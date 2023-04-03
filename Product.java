public class Product
{
int pcode;
String pname;
double price,lowest;
Product(int x, String y, double z)
{
pcode=x;
pname=y;
price=z;
}
public static void main(String args[])
{
Product obj1=new Product(100,"product1",200);
Product obj2=new Product(101,"product2",300);
Product obj3=new Product(102,"product3",400);
if(price1<price2&&price1<price3)
{
System.out.println("product 1 is lowest price");
}
else if(price2<price1&&price2<price3)
{
System.out.println("product 2 is lowest price");
}
else
{
System.out.println("product 3 is lowest price");
}
}
}

