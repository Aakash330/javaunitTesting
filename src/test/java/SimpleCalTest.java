import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalTest {

    @Test
   public void toCheckAddOfTwoNumber()
    {
        SimpleCal simpleCal=new SimpleCal();

       assertEquals(2,simpleCal.add(2,2));
    }

}