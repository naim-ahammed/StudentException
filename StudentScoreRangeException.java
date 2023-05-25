public class StudentScoreRangeException extends Exception {

    public StudentScoreRangeException(){
        super("exception ::: invalid");
    }
    public StudentScoreRangeException(String massage){
        super(massage);
    }
}
