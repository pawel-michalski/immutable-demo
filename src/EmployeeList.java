package src;


import java.util.ArrayList;
import java.util.List;

public final class EmployeeList {
	
	   private final List<String> employeeName = new ArrayList<>();
	   
	   
		public EmployeeList() {
			this.employeeName.add("Ewa");
		}

		public final List<String> addName(String name) {
			final List<String> newList = clone(employeeName);
			newList.add(name);
			employeeName.removeAll(employeeName);
			employeeName.addAll(newList);
			return employeeName;
		}

		public final List<String> removeEmployeeName(String name) {
			final List<String> newList = clone(employeeName);
			newList.remove(name);
			employeeName.removeAll(employeeName);
			employeeName.addAll(newList);
			return employeeName;
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
