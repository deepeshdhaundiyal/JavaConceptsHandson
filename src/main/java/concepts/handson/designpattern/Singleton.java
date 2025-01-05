package concepts.handson.designpattern;

public class Singleton {
    // Private static instance of Singleton
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {

    }

    // Public method to get the instance of Singleton
    public static Singleton getInstance() {
        // If instance is null, create a new instance
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Both should be the same instance
        System.out.println(singleton1 == singleton2); // true
    }
}