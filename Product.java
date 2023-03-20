public class Product
{
int pcode;
String pname;
double price,lowest;
void data(int x, String y, double z)
{
pcode=x;
pname=y;
price=z;
}
void display()
{
System.out.println(pcode+"\t"+pname+"\t"+price);
}
static void findlowest(double price1, double price2,double price3){
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
public static void main(String args[])
{
Product obj1=new Product();
Product obj2=new Product();
Product obj3=new Product();
obj1.data(100,"product1",200);
obj2.data(101,"product2",300);
obj3.data(102,"product3",400);
System.out.println("product info: pcode\n pname\n price");
obj1.display();
obj2.display();
obj3.display();
findlowest(obj1.price,obj2.price,obj3.price);
} 
}
