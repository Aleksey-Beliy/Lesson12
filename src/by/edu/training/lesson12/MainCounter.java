package by.edu.training.lesson12;

public class MainCounter {

	public static void main(String[] args) {
		
		Counter counter2 = new Counter();
		
		counter2.inc();
		counter2.inc();
		counter2.inc();
		counter2.inc();
		counter2.inc();
		counter2.inc();
		counter2.dec();
		counter2.dec();
		
		System.out.println(counter2.getCount());
	}

}
