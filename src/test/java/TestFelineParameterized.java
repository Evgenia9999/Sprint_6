import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

<<<<<<< HEAD
import static org.hamcrest.CoreMatchers.is;

=======
>>>>>>> 1c6eac9 (Parameterized tests were added and code coverage was updated)
@RunWith(Parameterized.class)
public class TestFelineParameterized {

    private Feline feline = new Feline();

    @Parameterized.Parameter
    public int kittenNum;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {0},
                {-1},
                {100}
        };
    }

    @Test
    public void getKittensTestWithParam() {

        int actual = feline.getKittens(kittenNum);
        Assert.assertEquals(kittenNum, actual);
    }
}





