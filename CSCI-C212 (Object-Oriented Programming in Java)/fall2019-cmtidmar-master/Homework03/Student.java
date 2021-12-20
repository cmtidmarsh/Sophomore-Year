package homework_03;

/*
 Implement a class Student. For the purpose of this exercise, a student
 has a name  and a total quiz score. Supply an appropriate constructor
 and methods 
 
 getName(), 
 addQuiz(int score),
 getTotalScore(), 
 and getAverageScore(). 
 
 To compute the average, you also need to store the
 number  of quizzes that the student took.
 
 Supply a StudentTester class that tests all methods.
 */

public class student {
    private String studentsName;
    private int numQuiz;
    private int totalScore;
    private int averageScore;
    private int score[];
    
    public student() {
      studentsName = "";
      numQuiz = 0;
      totalScore = 0;
      averageScore = 0;
      score = new int[100];
    }
    
    public student(String studentName) {
      studentsName = studentName;
      score = new int[100];
    }
    
    public String getName() {
        return studentsName;
    }
    
    
    public void addQuiz(int Score) {
          score[numQuiz] = Score;
          numQuiz++;
          totalScore = totalScore + Score;
    }
    
    public int getTotalScore() {
       return totalScore;
    }
    
    public int getAverageScore() {
        return totalScore / numQuiz;
    }
    
}
