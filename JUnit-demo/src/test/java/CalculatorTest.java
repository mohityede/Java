import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc=new Calculator();
    @Test
    void testDivide(){
        System.out.println("Testing calc divide method");
        double actual=calc.divide(11,2);
        double expected=5;
        assertEquals(actual,expected, "Wrong division...");
    }
    @Test
    void testDivide_suppelier_interface(){
        System.out.println("Testing calc divide method 2");
        double actual=calc.divide(11,2);
        double expected=5;
        assertEquals(actual,expected, ()->"Wrong division...");
    }
    @Test
    void testDoubleArray(){
        System.out.println("Testing double array method");
        int[] actual=calc.doubleArray(new int[]{2,3,3,9});
        int[] expected=new int[]{4,6,6,18};
        assertArrayEquals(actual,expected,()->"Array is not matched");
//        assertEquals(actual,expected,0);
    }

    @Test // these should failed if doubleArray function not throw exeption -> because we are passing null
    void testDoubleArray_exeption(){
        System.out.println("Testing double array method if we pass null");
        int[] temp=new int[]{2,3,7,9};
/*
        try{
            int[] actual=calc.doubleArray(temp);
            fail("it should throw nullPointer exception");
        }catch (NullPointerException e){
            System.out.println("Got null pointer exception!");
        }
 another way to achieve above
*/
        assertThrows(NullPointerException.class,()-> calc.doubleArray(null));
    }

    @Test // to test performance
    void testSortArray_performance(){
        System.out.println("Testing performance of sortArray method");
        int[] temp=new int[]{2,7,3,5,1};
        assertTimeout(Duration.ofMillis(100),()-> calc.sortArray(temp));
    }
}
