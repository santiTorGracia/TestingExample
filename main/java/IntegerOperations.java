public class IntegerOperations {
    private int num1, num2;

    public IntegerOperations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        int res = num1 + num2;
        if (num1 > 0 && num2 > 0 && res < 0) {
            throw new ArithmeticException("Integer overflow");
        }
        if (num1 < 0 && num2 < 0 && res > 0) {
            throw new ArithmeticException("Integer underflow");
        }
        return res;
    }
}
