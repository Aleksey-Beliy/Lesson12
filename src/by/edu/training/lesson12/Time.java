package by.edu.training.lesson12;

public class Time {

	private int hour;
	private int minutes;
	private int seconds;

	public Time() {

	}

	public Time(int hour, int minutes, int seconds) {
		setHour(hour);
		setMinutes(minutes);
		setSeconds(seconds);
	}

	public void setHour(int hour) {
		if (hour > 23 || hour < 0) {
			hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public void setMinutes(int minutes) {
		if (minutes > 59 || hour < 0) {
			minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public void setSeconds(int seconds) {
		if (seconds > 59 || seconds < 0) {
			seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void addHour(int hour) {

		int newHour = this.hour + hour;
		if (newHour >= 0 && newHour < 23) {
			this.hour = newHour;
		} else {
			this.hour = newHour % 24;
			;
		}
	}

	public void addMinutes(int minutes) {

		int newMinutes = this.minutes + minutes;
		int extraHour = newMinutes / 60;

		if (newMinutes >= 0 && newMinutes < 59) {
			this.minutes = newMinutes;
		} else {
			this.minutes = newMinutes % 60;
			addHour(extraHour);
		}
	}

	public void addSeconds(int seconds) {

		int newSeconds = this.seconds + seconds;
		int extraMinutes = newSeconds / 60;

		if (newSeconds >= 0 && newSeconds < 59) {
			this.seconds = newSeconds;
		} else {
			this.seconds = newSeconds % 60;
			addHour(extraMinutes);

		}
	}
}
