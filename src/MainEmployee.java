package src;
import java.util.List;

public class MainEmployee {

	public static void main(String[] args) {
		MainEmployee main = new MainEmployee();
		EmployeeList employeeList = new EmployeeList();
		
		main.print(employeeList.getAllList(), " Zawartoœæ listy");
		
		employeeList.addName("Darek");
		employeeList.addName("Edek");
		main.print(employeeList.getAllList(),"Dodajê Darek i Edek");

		employeeList.removeEmployeeName("Ewa");
		main.print(employeeList.getAllList(), "Usuwam Ewa");

		main.print(employeeList.getAllList(), " Zawartoœæ listy");

	}

	private  void print(List<String> currentList, String msesage) {	
		System.out.println(msesage);
		System.out.println("Numbers of element in List " + currentList.size());
		currentList.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("----------------------");
	}

}
