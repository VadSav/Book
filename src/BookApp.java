
public class BookApp {

	public static void main(String[] args) {
		Book  book1 =new Book();
book1.setAuthor("Pushkin");
book1.setTitle ("Onegin");
book1.setIsbn(1234567);
book1.setYear(2001);

Book book2=new Book();
book2. setAuthor("gogol");
book2. setTitle ("revisor");
book2. setIsbn (12398);
book2. setYear (176);


book1.display();
book2.display ();
System.out.println(book1.getAuthor());
System.out.println(book2.getTitle());


String str3=book1.getTitle();
System.out.println(str3);

	}

}
