package ex2_q1.q1;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String GradeTest(int grade) {
        if (grade < 1) {
            return "error";
        } else if (grade >= 1 && grade <= 49 ) {
            return "F";
        } else if (grade > 49 && grade <= 59) {
            return "E";
        } else if (grade > 59 && grade <= 69) {
            return "D";
        } else if (grade > 69 && grade <= 79) {
            return "C";
        } else if (grade >79 && grade <= 89) {
            return "B";
        } else if (grade > 89 && grade <= 100) {
            return "A";
        } else {
            return "error";
        }
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
