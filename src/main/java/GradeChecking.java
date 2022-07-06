public class GradeChecking {
    private static final String TAG = "GradeChecking";
    public String checkGrade(int number)
    {
        // score (0-100)
        int score = number;
        String grade = null;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        switch(score/10) {
            // for >= 90
            case 10:
            case 9:
                grade = "A";
                break;
            // for >= 80 and <90
            case 8:
                grade = "B";
                break;
            // for >= 70 and <80
            case 7:
                grade = "C";
                break;
            // for >= 60 and <70
            case 6:
                grade = "D";
                break;
            // for >= 50 and <60
            case 5:
                grade = "E";
                break;
            // for < 50
            default:
                grade = "F";
                break;
        }
           System.out.println("result :"+grade);
        return grade;

        // display result

    }

}
