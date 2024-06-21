package out.production.immutability;

 final class Singleton {

    private static Singleton INSTANCE;
    private String info = "Initial info class";

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    // getters and setters
}

class Test{
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}