import java.util.List;

public class MainImmutable {

	public static void main(String[] args) {
		MainImmutable main = new MainImmutable();

		Immutable immutable = new Immutable();

		immutable.addName("Darek");
		main.print(immutable.getAllList(), "dodano Darek");

		immutable.removeEmployeeName("Ewa");
		main.print(immutable.getAllList(), "usuniêto Ewa");

		System.out.println("pobieram element 0 " + immutable.getEmployeeName(0));
		System.out.println("pobieram element 1 " + immutable.getEmployeeName(1));
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
