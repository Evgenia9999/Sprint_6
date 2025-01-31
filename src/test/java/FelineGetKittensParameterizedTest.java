import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensParameterizedTest {

    private final int inputCount;
    private final int expectedCount;

    public FelineGetKittensParameterizedTest(int inputCount, int expectedCount) {
        this.inputCount = inputCount;
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1},
                {3, 3},
                {5, 5}
        });
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(expectedCount, feline.getKittens(inputCount));
    }
}