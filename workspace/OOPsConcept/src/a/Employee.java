package a;

public class Employee {
	int id;
	String name;
	float salary;			// property or instance variable
	
	// method passing parameter but no return type. 
	void setValue(int id1, String name1, float salary1) {	// local variable 
		id =id1;
		name=name1;
		salary=salary1;
	}
	// method no passing parameter and no return type. 
	void display() {			// behaviour or function or method 
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
