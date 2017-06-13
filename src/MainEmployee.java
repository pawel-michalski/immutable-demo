package src;
import java.util.ArrayList;
import java.util.List;

public class MainEmployee {

	public static void main(String[] args) {
	

		
		EmployeeList employeeList = createInitialEmployee();
		print(employeeList.getAllList(),"Tworzê listê inicjaln¹ z imionami Piotr i Karol");
		
		employeeList = addNewEmplyees(employeeList);
		print(employeeList.getAllList(),"Dodajê Darek i Edek");

		employeeList = addAnotherEmployee(employeeList);
		print(employeeList.getAllList(), "Dodajê Ewa");
		
		employeeList=removeEmployee(employeeList);
		print(employeeList.getAllList(), "Usuwam Ewa");

	    final String employeeWithIndexZero = employeeList.getEmployeeName(0);
	    System.out.println(employeeWithIndexZero + " pobrany z metody getEmployeeName()");

	}

	private static EmployeeList removeEmployee(EmployeeList employeeList) {
		return employeeList.removeEmployeeName("Ewa");
	}

	private static EmployeeList addAnotherEmployee(EmployeeList employeeList) {
		employeeList = employeeList.addName("Ewa");
		return employeeList;
	}

	private static EmployeeList addNewEmplyees(EmployeeList employeeList) {
		employeeList =employeeList.addName("Darek");
		employeeList =employeeList.addName("Edek");
		return employeeList;
	}

	private static EmployeeList createInitialEmployee() {
		final ArrayList<String> initial = new ArrayList<>();
		initial.add("Piotr");
		initial.add("Karol");
		EmployeeList employeeList = new EmployeeList(initial);
		return employeeList;
	}

	private static void print(List<String> currentList, String msesage) {	
		System.out.println(msesage);
		System.out.println("Numbers of element in List is: " + currentList.size());
		currentList.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("----------------------");
	}

}
