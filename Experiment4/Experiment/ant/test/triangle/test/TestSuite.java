package triangle.test;

import junit.framework.TestCase;
import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestSuite {

    public static int number = 0;
    public static Map<Integer, Object[]> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() throws Exception {
        data.put(0, new Object[]{-3, -5, -7, "INVALID", 0d});
        data.put(1, new Object[]{0, 0, 0, "INVALID", 0d});
        data.put(2, new Object[]{1, 2, 3, "INVALID", 0d});
        data.put(3, new Object[]{3, 4, 5, "RIGHT ANGLED", 6d});
        data.put(4, new Object[]{6, 6, 6, "EQUILATERAL", 15.588d});
        data.put(5, new Object[]{7, 7, 8, "ISOSCELES", 22.978d});
        data.put(6, new Object[]{7, 2, 8, "SCALENE", 6.437d});
        data.put(7, new Object[]{5, 12, 13, "RIGHT ANGLED", 30d});
        data.put(8, new Object[]{14, 17, 100, "INVALID", 0d});
        data.put(9, new Object[]{16, 48, 64, "INVALID", 0d});
        data.put(10, new Object[]{128, 256, 256, "ISOSCELES", 15863.74d});
        data.put(11, new Object[]{648, 648, 648, "EQUILATERAL", 181823.766d});
        data.put(12, new Object[]{300, 400, 500, "RIGHT ANGLED", 60000d});
        data.put(13, new Object[]{728, 1024, 512, "SCALENE", 174993.38});
        data.put(14, new Object[]{512, 1024, 2048, "INVALID", 0d});
        System.out.println("-------UpgradedTriangleTest Begins-------");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("-------UpgradedTriangleTest Finish-------");
    }

    @Before
    public void setUp() throws Exception {
        System.out.print("Test" + number + ": ");
    }

    @After
    public void tearDown() throws Exception {
        number++;
        System.out.println(" End");
    }

    public void test() {
        Object[] objects = data.get(number);
        System.out.print(triangle.UpgradedTriangle.classifyTriangle((int) objects[0], (int) objects[1], (int) objects[2]) + " - " + triangle.UpgradedTriangle.calculateArea((int) objects[0], (int) objects[1], (int) objects[2]));
        assertEquals(triangle.UpgradedTriangle.classifyTriangle((int) objects[0], (int) objects[1], (int) objects[2]), (String) objects[3]);
        assertEquals(triangle.UpgradedTriangle.calculateArea((int) objects[0], (int) objects[1], (int) objects[2]), objects[4]);
    }

    @Test
    public void test0() {
        test();
    }

    @Test
    public void test1() {
        test();
    }

    @Test
    public void test2() {
        test();
    }

    @Test
    public void test3() {
        test();
    }

    @Test
    public void test4() {
        test();
    }

    @Test
    public void test5() {
        test();
    }

    @Test
    public void test6() {
        test();
    }

    @Test
    public void test7() {
        test();
    }

    @Test
    public void test8() {
        test();
    }

    @Test
    public void test9() {
        test();
    }

    @Test
    public void test10() {
        test();
    }

    @Test
    public void test11() {
        test();
    }

    @Test
    public void test12() {
        test();
    }

    @Test
    public void test13() {
        test();
    }

    @Test
    public void test14() {
        test();
    }
}
