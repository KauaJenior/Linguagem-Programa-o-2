
public class Book {
	
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;

	 public String GetName() {
		 return name;
	 }
	 
	 public Book(String name, Author[] authors, double price, int qty) {
	        this.name = name;
	        this.authors = authors;
	        this.price = price;
	        this.qty = qty;
	    }
	 
	 public Author[] getAuthors() {
	
		 return authors;
	 }
	 
	 public double getPrice() {
		 return price;
	 }
	 
	 public void setPrice(double price) {
		 this.price = price;
	 }
	 
	 public int getQty(){
		 return qty;
	 }
	 
	 public void setQty(int qty) {
		 this.qty = qty;
	 }
	 
	 @Override
	 public String toString() {
		 StringBuilder authorsStr = new StringBuilder();
		    for (int i = 0; i < authors.length; i++) {
		        authorsStr.append(authors[i].toString());
		        if (i < authors.length - 1) {
		            authorsStr.append(", ");
		        }
		    }

		    return String.format("Book[name=%s, authors={%s}, price=%.2f, qty=%d]",
		                         name, authorsStr.toString(), price, qty);
	}
	
	 public String getAuthorNames() {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < authors.length; i++) {
	            sb.append(authors[i].GetName());
	            if (i < authors.length - 1) {
	                sb.append(", ");
	            }
	        }
	        return sb.toString();
	    }
	 }

