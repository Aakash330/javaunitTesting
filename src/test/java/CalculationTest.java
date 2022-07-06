import org.junit.*;

import static org.junit.Assert.*;

public class CalculationTest {

    //this is run first when u called any test method
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    /*after beforeClass it will be run when u will call any test class
      then after Test method run then after run then after class run
      following order code will be executed when testFindMax() called

      ------------------------
       before class
       before
       test case find max
       after
       after class
       _________________

     */
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(0,Calculation.findMax(new int[]{-12,-3,-4,-2}));
    }
    @Test
    public void FindtheCube()
    {
        assertEquals(27,Calculation.cube(3));
    }

    @Test
    public void testReverseWord(){
        System.out.println("test case reverse word");
        assertEquals("ym eman si nahk ",Calculation.reverseWord("my name is khan"));
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");


    }
}
/* when will be run All test by clicking on CalculationTest
  then you can observe that before class and after class run once
output is in following order

before class
before
test case find max
after
before
after
before
test case reverse word
after
after class


 */