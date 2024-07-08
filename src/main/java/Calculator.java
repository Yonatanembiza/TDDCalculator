public class Calculator {
    public int addTwoIntegers(int a, int b) {
        return a + b;
    }
    public int subtractTwoIntegers(int a, int b) {
        return a - b;
    }
    public double multiplyTwoIntegers(int a, int b){
        return a * b;
    }
    public double divideTwoIntegers(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    public int moduloTwoIntegers(int a, int b){
        return a % b;
    }
}
