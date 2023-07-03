class Publisher{
private String name;
public Publisher(String name){
this.name=name;
}
public String getName(){
return name;
}
}
class Books{
private String title;
private String author;
private Publisher publisher;
public Books(String title,String author,Publisher publisher){
this.title=title;
this.author=author;
}
public String getTitle(){
return title;
}
public String getAuthor(){
return author;
}
public Publisher getPublisher(){
return Publisher;
}
}
class Literature extends Books{
private String category;
public Literature(String title,String author,Publisher publisher,String category){
super(title,author,publisher);
this.category;
}
public String getCategory(){
return category;
}
}
class Fiction extends Books{
private String subcategory;
public Fiction(String title,String author,Publisher publisher,String subcategory){
super(title,author,publisher);
this.subcategory=subcategory;
public String getSubcategory(){
return subcategory;
}
}
public class BookDetails{
public static void main(String args[]){
Publisher selina=new Publisher("selina publication");
Publisher olivia=new Publisher("olivia publication");
Publisher marwell=new Publisher("marwell publication");
Publisher anna=new Publisher("anna publication");
Literature book1=new Literature("heaven of god","robert browning",selina,"classic");
Literature book2=new Literature("the love truth","ronald",olivia,"romance");
Literature book3=new Literature("who will cry when i die","elizabeth joe",marwell,"mystery");
Literature book4=new Literature("the land of dragons","j.k rowling",anna,"fantasy");
Books[]allbooks={book1,book2,book3,book4};
System.out.println("literature books");
printBoooksBycategory1(allBooks,Fiction.class);
system.out.println("Fiction books");
printBoooksBycategory1(allBooks,Fiction.class);
}
public static void printBoooksBycategory1(Books[] booksArray,class<?>category1){
for(Books book:booksArray){
if(category1.isInstance(book)){
System.out.println("Title:"+book.getTitle());
System.out.println("Author:"+book.getAuthor());
System.out.println("Publisher:"+book.getPublisher().getName());
if(category1==Literature.class){
Literature literatureBook=(Literature)book;
System.out.println("category:"+literatureBook.getCategory());
}
else if(category1==Fiction.class){
Fiction fictionBook=(Fiction)book;
System.out.println("subcategory:"+fictionBook.getSubcategory());
}
System.out.println();
}



