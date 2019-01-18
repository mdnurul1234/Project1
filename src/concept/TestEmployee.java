package concept;

public class TestEmployee {

	public static void main(String[] args) {
	
		Employee emp1 = new Employee();
		emp1.fullName = "Nurul Islam";
		emp1.salary = 68000;
		emp1.sex = 'M';
	    emp1.usCitizen = false;
	    emp1.employeeEvaluation();
	    emp1.employeeInfo();
	    
	    
	    Employee emp2 = new Employee();
	    emp2.fullName = "Jame";
	    emp2.salary = 62000;
	    emp2.sex = 'F';
	    emp2.usCitizen = true;
	    emp2.employeeEvaluation();
	    emp2.employeeInfo();
	    
	   

	}

}
