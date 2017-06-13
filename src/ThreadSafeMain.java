package src;
import java.util.List;

public class ThreadSafeMain {

	public static void main(String[] args) {
		ThreadSafeMain main = new ThreadSafeMain();

		ThreadSafe threadSafe = ThreadSafe.getInstance();

		threadSafe.addName("Darek");
		main.print(threadSafe.getAllList(), "dodano Darek");

		threadSafe.removeEmployeeName("Ewa");
		main.print(threadSafe.getAllList(), "usunięto Ewa");

		System.out.println("pobieram element 0 " + threadSafe.getEmployeeName(0));
		System.out.println("pobieram element 1 " + threadSafe.getEmployeeName(1));
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


