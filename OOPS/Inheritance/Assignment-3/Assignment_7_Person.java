
class Assignment_7_Person {
	String name;
	String DOB;
	
static class Teacher extends Assignment_7_Person{
	 int salary;
	 String subject;
 }
 
static class Student extends Assignment_7_Person{
	 String student_id;
 }
 
static class college_student extends Student{
	 
	 String college_name;
	 int year_of_study;
 }

	public static void main(String[] args) {
		Assignment_7_Person Per = new Assignment_7_Person();
		Teacher tea = new Teacher();
		Student stu = new Student();
		college_student cs = new college_student();
		
		
		tea.name = "Nagato";
		tea.DOB = "17 june 1979";
		tea.salary = 65000;
		tea.subject = "Compute communication";
		stu.name = "Satoshi";
		stu.DOB = "18 july 2000";
		stu.student_id = "20733426";
		cs.college_name = "VIT";
		cs.year_of_study = 4;

		System.out.println("The Teacher name is " + tea.name + " his D.O.B is " + tea.DOB + ".The subject he teaches is " + tea.subject + " and his salary monthly is " + tea.salary);
		System.out.println("The Student name is " + stu.name + " his D.O.B is " + stu.DOB + " the student id is " + stu.student_id + " the college name in which he studies is " + cs.college_name + " and year of his study is " + cs.year_of_study);
	}

}
