import org.hamcrest.Matcher;
import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

public class NewClassTest {

    @Rule
    public final TestRule globalTimeout = Timeout.millis(20);

    @Test
    public void square() {
        NewClass test = new NewClass(5);
        float expected = (float) (Math.PI * Math.pow(5, 2));
        float actual = test.Square();
        assertThat("Square test fals", expected, is(actual));
    }


    @Test
    public void perimetr() {
        NewClass test = new NewClass(5);
        float expected = (float) (2 * Math.PI * 5);
        float actual = test.Perimetr();
        assertThat("Perimetr test fals", expected, is(actual));
    }

    @Test
    public void scope() {
        NewClass test = new NewClass(5);
        float expected = (float) (4 / 3 * Math.PI * Math.pow(5, 3));
        float actual = test.Scope();
        assertThat("Scope test fals", expected, is(actual));
    }
}