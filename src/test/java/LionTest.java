import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void doesHaveManeSamecReturnsTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeSamecReturnFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void testInvalidSexLion() throws Exception {
        new Lion("Invalid sex", feline);
    }

    @Test
    public void testGetKittens() throws Exception {
        // Arrange
        Lion lion = new Lion("Самец", feline);
        when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(1, actual);
        }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }
}
