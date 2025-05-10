package singleton;

public class SingletonEager {
    
    private static SingletonEager instance = new SingletonEager();;

    private SingletonEager() {
        // Private constructor to prevent instantiation
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
