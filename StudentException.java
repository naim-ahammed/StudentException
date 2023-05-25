import java.util.Scanner;

public class StudentException {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print ( "Number of subjects: ");
        int subjectNo = inp.nextInt();

        double scores[] = new double[subjectNo];

        for (int i = 0; i < scores.length; i++) {

            try {
                scores[i] = getScore(i + 1);
            } catch (StudentScoreRangeException ex) {
                System.out.print(ex.getMessage());
                i--;
            }
        }
        double sum=0;
        for (double s : scores) {
            sum+=s;
        }
        System.out.print("Average: "+sum/subjectNo);
    }
    private static double getScore(int ind) throws StudentScoreRangeException {
        System.out.print("Score of sub ("+(ind)+"): ");
        double sc = (new Scanner(System.in)).nextDouble();
        if (sc<0|| sc>100) throw new StudentScoreRangeException();
        return sc;
    }
}
