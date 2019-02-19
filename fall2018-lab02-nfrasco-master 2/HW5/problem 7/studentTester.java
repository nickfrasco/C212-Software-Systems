
public class studentTester {

	public static void main(String[] args) {
		Student student = new student("Mark", 100);
		student.addQuiz(50);
		student.addQuiz(30);
		student.addQuiz(20);
		String name = student.getName();
		int totalScore = student.getTotalScore();
		double averagescore = student.getAverageScore();
		System.out.println("Name: " + name);
		System.out.println("Total Score: " + totalScore);
		System.out.println("Average Score: " + averagescore);
	}

}
