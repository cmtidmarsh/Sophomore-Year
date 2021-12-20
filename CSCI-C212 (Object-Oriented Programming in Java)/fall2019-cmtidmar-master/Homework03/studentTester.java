package homework_03;

public class studentTester {

	public static void main(String[] args) {
        student student = new student("Bin Liang");
        student.addQuiz(10);
        student.addQuiz(55);
        student.addQuiz(24);
        student.addQuiz(76);
        student.addQuiz(10);
        System.out.println(student.getName());
        System.out.println("Total Score: " + student.getTotalScore());
        System.out.println("Average Score: " + student.getAverageScore());
    }
    
}
