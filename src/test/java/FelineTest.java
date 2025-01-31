import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {


    private Feline feline;

    @Before
    public void initFeline() {feline = new Feline();}

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTestWithNoParam() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensTestWithParam() {
        int param = 3;
        int expectedKittens = feline.getKittens(param);
        assertEquals(param, expectedKittens);
    }
}





