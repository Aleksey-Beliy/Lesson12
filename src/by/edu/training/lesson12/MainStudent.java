package by.edu.training.lesson12;

public class MainStudent {

	public static void main(String[] args) {

		Student[] student = new Student[10];
		
		student[0] = new Student("Петров" , "А.А." , 1, new int[] {10, 9, 9, 10 ,10});
		student[1] = new Student("Иванов" , "Б.Б." , 1, new int[] {8, 8, 9, 8, 10});
		student[2] = new Student("Сидоров" , "В.В." , 1, new int[] {9, 10, 10, 9, 9});
		student[3] = new Student("Александров" , "А.А." , 1, new int[] {8, 9, 10, 9, 8});
		student[4] = new Student("Алексеев" , "Б.Б." , 1, new int[] {9, 9, 9, 10, 10});
		student[5] = new Student("Петров" , "Д.Д." , 1, new int[] {10, 9, 9, 10 ,10});
		student[6] = new Student("Громов" , "А.А." , 1, new int[] {8, 8, 9, 8, 10});
		student[7] = new Student("Иванов" , "Ж.Ж." , 1, new int[] {8, 9, 10, 9, 8});
		student[8] = new Student("Сидоров" , "Ю.Ю." , 1, new int[] {8, 9, 10, 9, 8});
		student[9] = new Student("Александров" , "Я.Я." , 1, new int[] {10, 9, 9, 10 ,10});

		
		for (int i = 0; i < student.length; i++) {
			if(student[i].excellentStudents()) {
				student[i].print();
			}
		}
	}

}
