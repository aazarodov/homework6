import homework6.Tasks;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Task1TestException {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    public Task1TestException() {

    }

    Tasks tasks;

    @Before
    public void init() {
        tasks = new Tasks();
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Массив пустой или число '4' отсутствует в массиве!");
    }

    @Test
    public void test1Task1() throws RuntimeException {
        tasks.task1(null);
    }

    @Test
    public void test2Task1() throws RuntimeException {
        tasks.task1(new Integer[]{});
    }

    @Test
    public void test3Task1() throws RuntimeException {
        tasks.task1(new Integer[]{1, 2, 3});
    }
}
