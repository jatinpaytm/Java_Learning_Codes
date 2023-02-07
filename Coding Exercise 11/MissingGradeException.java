public class MissingGradeException extends Exception {
    private int studentID;
    
    public MissingGradeException(int studentID) {
        // this is a predeclared super class of exception which we cant see
        super("student is yet to receive a grade");
        this.studentID = studentID;
    }
    
    public int getStudentId()
    {
        return studentID;
    }
}