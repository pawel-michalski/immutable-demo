import java.util.ArrayList;
import java.util.List;

public class MainMutable {

	public static void main(String[] args) {
		MainMutable main = new MainMutable();
		List<String> initList = main.init();
		
		Mutable mutable = new Mutable(initList);
		main.print(mutable.getAllList(), "inicjalizacja. Dodano Jan");
		
		mutable.addName("Darek");
		main.print(mutable.getAllList(), "dodano Darek");
		
		
		mutable.removeEmployeeName("Jan");
		main.print(mutable.getAllList(), "usuniêto Jan");
		
		System.out.println("pobieram element 0 "+ mutable.getEmployeeName(0));
		System.out.println("pobieram element 1 " +mutable.getEmployeeName(1));
	}
	private List<String> init(){
		List<String> initList = new ArrayList<>();
		initList.add("Jan");
		return initList;
	}
	
	private void print(List<String> currentList, String myMessage) {
		
		System.out.println(myMessage);
		System.out.println("Numbers of element in List " + currentList.size());
		currentList.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("----------------------");
	}



}
