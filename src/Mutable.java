import java.util.ArrayList;
import java.util.List;

public final class Mutable {

    private List<String> employeeName = new ArrayList<>();

	public Mutable(List<String> employeeName) {
		this.employeeName = employeeName;
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
