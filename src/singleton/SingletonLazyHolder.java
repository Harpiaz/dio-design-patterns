package singleton;

public class SingletonLazyHolder {
    
    private static class Holder {
        public static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        // Private constructor to prevent instantiation
    }

    public static SingletonLazyHolder getInstance() {
        return Holder.INSTANCE;
    }

}
