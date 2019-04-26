
public class Book {
	
private int isbn;
private String author ;
private String title ;
private int year ;
public int getIsbn() {
	return isbn;
}
	public String getAuthor() {
		return author ;
	}
public String getTitle () {
	return title ;
}
	public int getYear () {
		return year;
	
}
	public void setIsbn(int isbn) {
		this. isbn=isbn;
	}
	public void setAuthor(String author) {
}
	public void setTitle(String title) {
		this.title=title;
		
		
	}
	public void setYear(int year) {
		if (year<1986) {
			year =2000;
		}
		this.year =year;
	}
	public void display() {
		System.out.println("Book");
		System.out.println("author"+author);
		System.out.println("title:"+title);
		System.out.println("year:"+year);
		System.out.println("isbn"+isbn);
		
		
		
	}
}