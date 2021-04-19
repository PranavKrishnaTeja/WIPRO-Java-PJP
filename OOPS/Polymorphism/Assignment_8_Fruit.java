
class Assignment_8_Fruit {
	String name;
	String size;
	String taste;
	
	public void eat(){
		
	}
	
	static class Apple extends Assignment_8_Fruit{
		
		Apple(){
			name = "Apple";
			taste = "Sweet";
			size = "Large";
		}
		@Override
		public void eat() {
			System.out.println("The name of fruit is " + name + " it is " + size + " in size and it tastes " + taste);
		}
	}
	
	static class Orange extends Assignment_8_Fruit{
		Orange(){
			name = "Orange";
			taste = "Sweet-tart";
			size = "Meduim";
		}
		@Override
		public void eat() {
			System.out.println("The name of fruit is " + name + " it is " + size + " in size and it tastes " + taste);
		}
	}

	public static void main(String[] args) {
		
		Assignment_8_Fruit fru = new Assignment_8_Fruit();
		Apple ap = new Apple();
		Orange or = new Orange();
		
		ap.eat();
		or.eat();
		
		

	}

}
