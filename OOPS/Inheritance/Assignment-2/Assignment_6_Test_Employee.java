
public class Assignment_6_Test_Employee {

	public static void main(String[] args) {
		Assignment_6_Employee TE = new Assignment_6_Employee();
		
		TE.setname("YAHIKO");
		TE.setAnnualsalary(20000);
		TE.setNationalInsuranceNumber("24589726");
		TE.setYearofjoining(2015);
		
		System.out.println(TE.getname() + " salary is " + TE.getAnnualsalary() + " insurance number is " + TE.getNationalInsuranceNumber() + " and year of joining is " + TE.getYearofjoining());
	}

}
