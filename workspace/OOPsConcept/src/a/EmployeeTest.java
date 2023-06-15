package a;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	Employee emp3 = new Employee();
	emp1.id=100;
	emp1.name="lex";
	emp1.salary=12000;
    
	emp2.id=101;
    emp2.name="Steven";
    emp2.salary=14000;
    
    
    emp3.setValue(102, "Lokesh", 15000);
    
	emp1.display();
	emp2.display();
	emp3.display();
	}

}
