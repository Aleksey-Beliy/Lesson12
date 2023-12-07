package by.edu.training.lesson12;

public class Counter {

	private int count = 0;
	private int min = 0;
	private int max = 10;

	public Counter(int min, int max, int count) {
		count = 0;
		min = 0;
		max = 9;
	}

	public Counter() {
	}

	public void inc() {
		count++;

		if (count > max) {
			count = 0;
		}
	}

	public void dec() {
		count--;

		if (count < min) {
			count = 10;
		}
	}
	
	public int getCount() {
		return count;
	}
}
