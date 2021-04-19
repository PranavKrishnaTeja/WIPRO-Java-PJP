
abstract class Assignment_9_Shape {

	void draw() {
		
	}
	
	void erase() {
		
	}
	
	static class circle extends Assignment_9_Shape{
		@Override
		void draw() {
			System.out.println("Drawing circle");
		}
		
		void erase() {
			System.out.println("Erasing circle");
		}
	}
	
	static class triangle extends Assignment_9_Shape{
		@Override
		void draw() {
			System.out.println("Drawing triangle");
		}
		
		void erase() {
			System.out.println("Erasing triangle");
		}
	}
	
	static class square extends Assignment_9_Shape{
		@Override
		void draw() {
			System.out.println("Drawing square");
		}
		
		void erase() {
			System.out.println("Erasing square");
		}
	}
	public static void main(String[] args) {
	
		Assignment_9_Shape c=new circle();
		Assignment_9_Shape t=new triangle();
		Assignment_9_Shape s=new square();
		
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
