public class Overload {

    public void assignValues(int a, int b) {
        System.out.println("Two integer parameters:");
        System.out.println("a: " + a + ", b: " + b);
    }

    public void assignValues(int a, double b) {
        System.out.println("One integer and one double parameter:");
        System.out.println("a: " + a + ", b: " + b);
    }

    public void assignValues(double a, int b) {
        System.out.println("One double and one integer parameter:");
        System.out.println("a: " + a + ", b: " + b);
    }

    public void assignValues(int a, int b, int c) {
        System.out.println("Three integer parameters:");
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();

        obj.assignValues(10, 20);
        obj.assignValues(10, 20.5);
        obj.assignValues(10.5, 20);
        obj.assignValues(10, 20, 30);
    }
}
