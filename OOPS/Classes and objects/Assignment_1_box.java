import java.util.Scanner;

public class Assignment_1_box { 

	public int height;
	public int width;
	public int depth;
	
	Assignment_1_box(int newheight, int newwidth, int newdepth){
		height = newheight;
		width = newwidth;
		depth = newdepth;
	}
	int volume(){
		return height * width * depth;
	}

	public static void main(String[] args) {
		
		Assignment_1_box s = new Assignment_1_box(10, 20, 30);
		System.out.println("The Volume is " + s.volume());
	}

}
