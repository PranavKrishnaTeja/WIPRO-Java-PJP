
public class Assignment_3_Patient {
	public static String Name;
	public static double height;
	public static double weight;
	
	Assignment_3_Patient(String newname, double newheight, double newweight){
		Name = newname;
		height = newheight;
		weight = newweight;
	}
	double computeBMI(){
		return 	(weight / (height * height));
	}

	public static void main(String[] args) {
		
		Assignment_3_Patient p = new Assignment_3_Patient("20733426", 1.75, 115);
		System.out.println(Name + " Your BMI is " + p.computeBMI());

	}

}
