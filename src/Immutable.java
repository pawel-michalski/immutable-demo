import java.util.ArrayList;
import java.util.List;

public class Immutable {
	
	   private final List<String> employeeName = new ArrayList<>();
	   private static Immutable immutable = null;
	   
		private Immutable() {
			this.employeeName.add("Ewa");
		}

		public static Immutable getInstance() {
			if (immutable == null) {
				immutable = new Immutable();
			} 
			return immutable;
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
