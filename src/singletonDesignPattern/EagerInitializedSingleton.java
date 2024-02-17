package singletonDesignPattern;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

