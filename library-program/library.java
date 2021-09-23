abstract class Books {
    String BookTitle;
    int Price;
}

class Customer extends Books {
    String BookTitle;
    int Price;
    private String Cname;

    public String getName() {
        return BookTitle;
    }
    public int getPrice() {
        return Price;
    }
    public String getCust() {
        return Cname;
    }
    public void setCust(String name) {
        Cname = name;
    }
}

public class Library {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.BookTitle = "Looking for Alaska";
        cust1.Price = 500;
        cust1.setCust("Palkin Wadhwa");
        System.out.println("Customer Name: " +cust1.getCust());
        System.out.println("Book Purchased: " +cust1.getName());
        System.out.println("Book Price: " +cust1.Price);
    }
}
