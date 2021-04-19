import java.util.*;
class Assignment_4_Author {
	
	String Name;
	String email;
	char gender;
	
	void setname(String newname) {
		Name = newname;
	}
	String getname() {
		return Name;
	}
	
	void setemail(String newemail) {
		email = newemail;
	}
	String getemail() {
		return email;
	}
	
	void setgender(char newgender) {
		gender = newgender;
	}
	char getgender() {
		return gender;
	}
	
static class Book extends Assignment_4_Author{
		
		 String name;
		 double price;
		 int qtyinstock;
	
	void setName(String newName) {
		name = newName;
	}
	String getName() {
		return name;
	}
	
	 void setprice(double newprice) {
		price = newprice;
	}
	 double getprice() {
		return price;
	}
	
	 void setqtyinstock(int newqtyinstock) {
		qtyinstock = newqtyinstock;
	}
	 int getqtyinstock() {
		return qtyinstock;
	}
	
}


	public static void main(String[] args) {
		Assignment_4_Author author = new Assignment_4_Author();
		Book B = new Book();

		author.setname("20733426");
		author.setemail("20733426@abc.com");
		author.setgender('M');
		B.setname("Java");
		B.setprice(156);
		B.setqtyinstock(458);
		
		System.out.println("The author of the book " + B.getname() + " is " + author.getname() + " he is " + author.getgender() + " and his mail id is " + author.getemail() + ".The price of each book is " + B.getprice() + " and the available stock is " + B.getqtyinstock());
				

	}

}