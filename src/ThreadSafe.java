import java.util.ArrayList;
import java.util.List;

public class ThreadSafe {
	 private final List<String> employeeName = new ArrayList<>();
	   private static ThreadSafe threadSafe = null;
	   
		private ThreadSafe() {
			this.employeeName.add("Ewa");
		}

		public static ThreadSafe getInstance() {
			if (threadSafe == null) {
				threadSafe = new ThreadSafe();
			} 
			return threadSafe;
		}
		public synchronized void addName(String name) {
			employeeName.add(name);
		}

		public synchronized void removeEmployeeName(String name) {
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
