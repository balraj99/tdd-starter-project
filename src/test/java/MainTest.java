import main.Main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MainTest {

    @Test
    public void testPrintHelloWorld(){
        assert Main.sayHelloWorld().equals("Hello World!");
    }

}
