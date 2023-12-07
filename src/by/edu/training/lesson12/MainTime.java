package by.edu.training.lesson12;

public class MainTime {

	public static void main(String[] args) {

		Time time = new Time();

		time.setHour(12);
		time.setMinutes(45);
		time.setSeconds(50);

		time.addHour(25);
		time.addMinutes(10);
		time.addSeconds(123);

		System.out.println(time.getHour() + " ч.  " + time.getMinutes() + " мин.  " + time.getSeconds() + " сек.");
	}

}
