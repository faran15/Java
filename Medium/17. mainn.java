class Superclass {
    int num;

    public Superclass(int num) {
        this.num = num;
    }

    public void display() {
        System.out.println("Superclass: num = " + num);
    }
}

class Subclass extends Superclass {
    int num;

    public Subclass(int num1, int num2) {
        super(num1);
        this.num = num2;
    }

    public void display() {
        super.display(); 
        System.out.println("Subclass: num = " + num);
    }
}

public class Mainn {
    public static void main(String[] args) {
        Subclass obj = new Subclass(10, 20);

        obj.display();
    }
}
