package src;


import java.util.ArrayList;
import java.util.List;

public final class EmployeeList {
	
	   private final List<String> employeeName;
	   
		public EmployeeList(List<String> list) {
			employeeName = new ArrayList<>();
			for(int i=0; i<list.size(); i++){
				employeeName.add(list.get(i));
			}
		}
		
		public final EmployeeList addName(String name) {
			final List<String> cloneEmployeeList = getAllList();
			cloneEmployeeList.add(name);
			return new EmployeeList(cloneEmployeeList);
		}

		public final EmployeeList removeEmployeeName(String name) {
			final List<String> cloneEmployeeList = getAllList();
			cloneEmployeeList.remove(name);
			return new EmployeeList(cloneEmployeeList);
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
