import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Lifecycle.PER_METHOD is default
public class ShapeTest {
    @AfterAll
    static void completed(){
        System.out.println("All testcases executed");
    }

    Shape shape;

    @BeforeEach
    void initial(){
        System.out.println("creating object of shape");
        shape=new Shape();
    }

    @Test
    void testRactangleArea(){
        System.out.println("Testing area of ractangle method");
        int actual=shape.ractangleArea(2,3);
        assertEquals(6,actual,()->"not valid area of ractangle");
    }

    @Test
    void testCircleArea(){
        System.out.println("Testing area of Circle method");
        double actual=shape.circleArea(2.5);
        assertEquals(19.625,actual,()->"not valid area of circle");
    }
}
