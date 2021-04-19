
public class Assignment_6_Employee extends Assignment_6_Person {
	double Annual_salary;
	int Year_of_joining;
	String National_insurance_number;

	void setAnnualsalary(double newAnnualsalary) {
		Annual_salary = newAnnualsalary;
	}
	
	double getAnnualsalary() {
		return Annual_salary;
	}
	
	void setYearofjoining(int newyearofjoining) {
		Year_of_joining = newyearofjoining ;
	}
	
	int getYearofjoining() {
		return Year_of_joining;
	}
	
	void setNationalInsuranceNumber(String newNationalInsuranceNumber) {
		National_insurance_number = newNationalInsuranceNumber;
	}
	
	String getNationalInsuranceNumber() {
		return National_insurance_number;
	}

}
