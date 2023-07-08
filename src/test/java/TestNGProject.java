import org.testng.annotations.*;

public class TestNGProject {

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("Before Method");
    }

    @BeforeClass
    public void beforeClass (){
        System.out.println("Before Method");
    }

    @Test
    public void testNo1 (){
        System.out.println("Test no 1");
    }

    @Test
    public void testNo2 (){
        System.out.println("Test no 2");
    }

    @AfterClass
    public void afterClass (){
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.println("After Method");
    }
}
