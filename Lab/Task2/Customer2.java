package Task2;

public class Customer2 {
     
    public static String generateProductCode(String productName, int productId) {
        return productName + "-" + productId;
    }

    public static void main(String[] args) {
        String productName = "Laptop";
        int productId = 12345;
        System.out.println("Product Code: " + generateProductCode(productName, productId));
    }
}


