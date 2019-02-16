import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerOperationsTest {

    @Test
    public void testCommutativeProperty() {
        IntegerOperations io1 = new IntegerOperations(2, 3);
        IntegerOperations io2 = new IntegerOperations(3, 2);

        Assertions.assertEquals(io1.add(), io2. add());
    }

    @Test
    public void testOverflowThrowsException() {
        IntegerOperations io = new IntegerOperations(Integer.MAX_VALUE, 1);

        try {
            io.add();
            Assertions.fail("Arithmetic Exception was not thrown.");
        } catch (ArithmeticException ignored) {}
    }

    // testOverflowThrowsExceptionV2/V3 do the same as the above function.

    @Test
    public void testOverflowThrowsExceptionV2() {
        IntegerOperations io = new IntegerOperations(Integer.MAX_VALUE, 1);
        Assertions.assertThrows(ArithmeticException.class, () -> {io.add();});
    }

    @Test
    public void testOverflowThrowsExceptionV3() {
        IntegerOperations io = new IntegerOperations(Integer.MAX_VALUE, 1);
        Assertions.assertThrows(ArithmeticException.class, io::add);
    }

    @Test
    public void testUnderflowThrowsException() {
        IntegerOperations io = new IntegerOperations(Integer.MIN_VALUE, -1);

        try {
            io.add();
            Assertions.fail("Arithmetic Exception was not thrown.");
        } catch (ArithmeticException ignored) {}
    }
}
