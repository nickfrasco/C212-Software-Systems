
public class student {
	private String name;
	private int totalScore;
	private int quizzesCount;
	
	public student(String strName, int totalQuizScore)
	{
		name = strName;
		totalScore = totalQuizScore;
		quizzesCount = 1;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addQuiz(int score)
	{
		totalScore = totalScore + score;
		quizzesCount = quizzesCount + 1;
		
	}
	
	public int getTotalScore()
	{
		return totalScore;
	}
	
	public double getAverageScore()
	{
		double average = totalScore/quizzesCount;
		return average;
		
	}
}
