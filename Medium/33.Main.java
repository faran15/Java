class ParentClass {
    public void parentMethod() {
        System.out.println("This is parent class");
    }
}
class ChildClass extends ParentClass {
    // Method in child class
    public void childMethod() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        ChildClass childObj = new ChildClass();
        parentObj.parentMethod();
        childObj.childMethod();
        childObj.parentMethod(); // Inherited method from parent class
    }
}
