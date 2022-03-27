import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackPackTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void backPack_Solution() {
        int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int result[][] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4},
                {0, 0, 0, 4, 5, 5, 5, 9, 9, 9, 9},
                {0, 0, 0, 4, 5, 6, 6, 9, 10, 11, 11}};
        assertEquals(result, BackPack.BackPack_Solution(m, n, w, p));
    }
}