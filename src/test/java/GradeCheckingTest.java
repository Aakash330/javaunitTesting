import org.junit.Test;

import static org.junit.Assert.*;

public class GradeCheckingTest {


    @Test
   public void checkingGrade()
    {
       GradeChecking gradeChecking=new GradeChecking();
       gradeChecking.checkGrade(45);
      // assertEquals("A",gradeChecking.checkGrade(13));

    }
   /* this time out function to check if method will take time more than 1
     second then it will automatically fail.
    */

    @Test(timeout = 1000)
    public void checkingGradeA()
    {
        GradeChecking gradeChecking=new GradeChecking();
        gradeChecking.checkGrade(45);
        // assertEquals("A",gradeChecking.checkGrade(13));

    }

}