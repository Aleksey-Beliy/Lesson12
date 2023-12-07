package by.edu.training.lesson12;

public class Student {

	private String surname;
	private String initials;
	private int groupNum;
	private int[] marks = new int[5];

	public Student(String surname, String initials, int groupNum, int[] marks) {

		this.surname = surname;
		this.initials = initials;
		this.groupNum = groupNum;
		this.marks = marks;
	}

	public boolean excellentStudents() {

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] != 9 && marks[i] != 10) {
				return false;
			}
		}
		return true;

	}

	public void print() {
		System.out.print(surname + " " + initials + "  Группа: " + groupNum + "    Успеваемость: ");
		for (int i = 0; i < marks.length; i++) {
			System.out.printf("%d; ", marks[i]);
		}
		System.out.println();
	}
}
