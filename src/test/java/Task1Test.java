import homework6.Tasks;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task1Test {
    @Parameterized.Parameters
    public static Collection<Integer[][]> data() {
        return Arrays.asList(new Integer[][][]{
                {{1, 2, 3, 4, 5, 6, 7, 4, 1, 3, 4, 9, 2, 1}, {9, 2, 1}},
                {{1, 2, 3, 4, 5, 6, 7, 4, 1, 3, 4, 9, 2, 1}, {4, 1, 3, 4, 9, 2, 1}},
                {{1, 2, 3, 4, 5}, {5}},
                {{1, 2, 3, 4, 5}, {1}},
                {{1, 2, 3, 4}, {}},
        });
    }

    private Integer[] sourceArray;
    private Integer[] destinationArray;

    public Task1Test(Integer[] sourceArray, Integer[] destinationArray) {
        this.sourceArray = sourceArray;
        this.destinationArray = destinationArray;
    }

    Tasks tasks;

    @Before
    public void init() {
        tasks = new Tasks();
    }

    @Test
    public void testTask1() {
        Assert.assertArrayEquals(destinationArray, tasks.task1(sourceArray));
    }
}
