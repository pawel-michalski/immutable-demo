import java.util.ArrayList;
import java.util.List;

public class Immutable {
	   private final List<String> employeeName = new ArrayList<>();

		public Immutable() {
			this.employeeName.add("Ewa");
		}

		public void addName(String name) {
			employeeName.add(name);
		}

		public void removeEmployeeName(String name) {
			employeeName.remove(name);
		}
		
		public String getEmployeeName(int index){
			if(index < employeeName.size()) {
				return employeeName.get(index);
			} else {
				return "";
			}
		}
		
		public List<String> getAllList() {
			return employeeName;
		}
 
}
