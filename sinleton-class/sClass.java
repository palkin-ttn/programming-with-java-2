public class sClass {
    private static sClass obj;

    static {
        obj = new sClass();
    }
    private sClass() {
    }
    public static sClass getInstance() {
        return obj;
    }
    public void testMe() {
        System.out.println("Singleton class is working.");
    }
    public static void main(String[] args) {
        sClass ms = getInstance();
        ms.testMe();
    }
}
