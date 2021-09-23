public class Blocks {
    public static void main(String args[]) {
        try {
            int a[] = new int[8];
            a[4] = 30/0;
            System.out.println("Try block");
        }
        catch(ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayOutOfBoundsException");
        }
        catch(Exception e) {
            System.out.println("Warning: Some other Exception");
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("Out of try, catch and finally block...");
    }
}
