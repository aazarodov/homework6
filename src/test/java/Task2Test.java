import homework6.Tasks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task2Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, new Boolean(false)},
                {new Integer[]{}, false},
                {new Integer[]{1, 1}, false},
                {new Integer[]{4, 4}, false},
                {new Integer[]{1, 2, 3, 4}, false},
                {new Integer[]{1, 4}, true},
                {new Integer[]{1, 4, 1, 4}, true},
        });
    }

    private Integer[] sourceArray;
    private boolean result;

    public Task2Test(Integer[] sourceArray, boolean result) {
        this.sourceArray = sourceArray;
        this.result = result;
    }

    Tasks tasks;

    @Before
    public void init() {
        tasks = new Tasks();
    }

    @Test
    public void testTask1() {
        Assert.assertEquals(result, tasks.task2(sourceArray));
    }
}
