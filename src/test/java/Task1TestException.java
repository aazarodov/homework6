import homework6.Tasks;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task1TestException {

    @Parameterized.Parameters
    public static Collection<Integer[][]> data() {
        return Arrays.asList(new Integer[][][]{
                {null, },
                {{}, },
                {{1, 2, 3}, },
                {{1, 2, 3, 5, 6, 7, 8}, },
                {{1, 2, 3, 4, 5, 6, 7, 8}, }, // для этого набора тест не пройдет, т.к. 4 присутствует в массиве, соотв-но эксепшена не будет
        });
    }

    private Integer[] sourceArray;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    public Task1TestException(Integer[] sourceArray) {
        this.sourceArray = sourceArray;
    }

    Tasks tasks;

    @Before
    public void init() {
        tasks = new Tasks();
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Массив пустой или число '4' отсутствует в массиве!");
    }

    @Test
    public void testTask1() throws RuntimeException {
        tasks.task1(sourceArray);
    }
}
