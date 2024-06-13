class SingletonException extends Exception {
    public SingletonException(String message) {
        super(message);
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() throws SingletonException {
        if (instance == null) {
            instance = new Singleton();
        } else {
            throw new SingletonException("Only one instance of Singleton can be created.");
        }
        return instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        try {
            Singleton s1 = Singleton.getInstance();
            System.out.println("First instance created");

            Singleton s2 = Singleton.getInstance();
            System.out.println("Second instance created");
        } catch (SingletonException e) {
            System.out.println(e.getMessage());
        }
    }
}
