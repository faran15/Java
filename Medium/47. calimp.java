interface IterF1 {
    void add(int num1, int num2);
    void sub(int num1, int num2);
}

class Calculator implements IterF1 {
    @Override
    public void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
    }

    @Override
    public void sub(int num1, int num2) {
        int diff = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + diff);
    }
}

public class calimp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 3); 
        calculator.sub(5, 3); 
    }
}
