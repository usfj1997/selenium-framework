package listeners;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGListenerDemo1 {
    @Test
    public void test4() {
        System.out.println("I am inside test 4");
    }

    @Test
    public void test5() {
        System.out.println("I am inside test 5");
    }

    @Test
    public void test6() {
        System.out.println("I am inside test 6");
        throw new SkipException("");
    }
}
