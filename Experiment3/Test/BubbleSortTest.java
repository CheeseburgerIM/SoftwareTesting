import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void bubbleSort() {
        int[] arr = new int[]{1, 6, 2, 2, 5};
        int[] res = new int[]{1, 2, 2, 5, 6};
        assertEquals(Arrays.toString(res), Arrays.toString(BubbleSort.BubbleSort(arr)));
    }
}