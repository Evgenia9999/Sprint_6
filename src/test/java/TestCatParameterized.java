import com.example.Cat;
import com.example.Feline;
<<<<<<< HEAD
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
=======
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
>>>>>>> 1c6eac9 (Parameterized tests were added and code coverage was updated)
public class TestCatParameterized {

    @Spy
    Feline feline;

<<<<<<< HEAD
    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
=======
    @Before
    public void SetUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameter
    public int initNum;

    @Parameterized.Parameter(1)
    public String stringInsert;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {0, "Травоядное"},
                {1, "Хищник"},
                {0, "test"}
        };
>>>>>>> 1c6eac9 (Parameterized tests were added and code coverage was updated)
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
<<<<<<< HEAD
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
=======
        Mockito.verify(feline, Mockito.times(initNum)).getFood(stringInsert);
>>>>>>> 1c6eac9 (Parameterized tests were added and code coverage was updated)
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

}
