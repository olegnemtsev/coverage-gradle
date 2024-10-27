import org.junit.jupiter.api.Test;

public class ClassWithNoCoverageTest {

    @Test
    public void testHelper(){
        ClassWithNoCoverage classWithNoCoverage = new ClassWithNoCoverage();
        classWithNoCoverage.helpMethodWithCoverage();
    }

}
