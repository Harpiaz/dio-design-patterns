package singleton;

public class SingletonLazy {
    
    private static SingletonLazy instance;

    private SingletonLazy() {
        // Private constructor to prevent instantiation
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
