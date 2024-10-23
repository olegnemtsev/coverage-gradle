import org.junit.jupiter.api.Test;

public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");
        System.out.println("hi");
        //assertEquals("onetwo", result);

    }
}
