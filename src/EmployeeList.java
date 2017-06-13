package src;


import java.util.ArrayList;
import java.util.List;

public final class EmployeeList {
	
	   private final List<String> employeeName = new ArrayList<>();
	   
	   
		public EmployeeList() {
			this.employeeName.add("Ewa");
		}

		public EmployeeList(List<String> list) {
			for(int i=0; i<list.size(); i++){
				employeeName.add(list.get(i));
			}
		}
		
		public final EmployeeList addName(String name) {
			employeeName.add(name);
			return new EmployeeList(employeeName);
		}

		public final EmployeeList removeEmployeeName(String name) {
			employeeName.remove(name);
			return new EmployeeList(employeeName);
		}
		
		public String getEmployeeName(int index){
			if(index < employeeName.size()) {
				return employeeName.get(index);
			} else {
				return "";
			}
		}
		
		public List<String> getAllList() {
			return clone(employeeName);

		}
		
		private List<String> clone(List<String> source) {
			final ArrayList<String> destination = new ArrayList<String>();
			source.forEach(item -> {
				destination.add(item);
			});
			return destination;
		}
 
}
