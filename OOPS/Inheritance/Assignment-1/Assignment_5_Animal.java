
public class Assignment_5_Animal {
	
	public void eat() {
		System.out.println("animal is eating");
	}
	
	public void sleep() {
		System.out.println("animal is Sleeping ");
	}
	
 static class Bird extends Assignment_5_Animal{
	@Override
	 public void eat() {
			System.out.println("bird is eating");
		}
		@Override
		public void sleep() {
			System.out.println("bird is Sleeping ");
		}
	 
	 public void fly() {
		System.out.println("bird is Flying through skies");
	}
}

	public static void main(String[] args) {
		Assignment_5_Animal ani = new Assignment_5_Animal();
		Bird bir = new Bird();
		
		ani.eat();
		ani.sleep();
		bir.eat();
		bir.sleep();
		bir.fly();
	}

}
