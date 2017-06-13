import java.util.List;

public class MainImmutable {

	public static void main(String[] args) {

		Immutable immutable = Immutable.getInstance();
		
		// Nie mo¿na dodawac ani usuwaæ
		
//
//		immutable.addName("Darek");
//		main.print(immutable.getAllList(), "dodano Darek");
//
//		immutable.removeEmployeeName("Ewa");
//		main.print(immutable.getAllList(), "usuniêto Ewa");

		print(immutable.getAllList());

	}

	private static void print(List<String> currentList) {		
		System.out.println("Numbers of element in List " + currentList.size());
		currentList.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("----------------------");
	}

}
