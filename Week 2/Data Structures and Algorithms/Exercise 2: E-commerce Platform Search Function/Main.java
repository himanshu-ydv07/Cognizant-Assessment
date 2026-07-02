import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(109, "Watch", "Accessories"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(107, "Mobile", "Electronics")

        };

        System.out.println("========== LINEAR SEARCH ==========\n");

        Product linearResult = LinearSearch.search(products, 103);

        if (linearResult != null) {
            System.out.println("Product Found");
            System.out.println(linearResult);
        } else {
            System.out.println("Product Not Found");
        }

        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        System.out.println("\n========== BINARY SEARCH ==========\n");

        Product binaryResult = BinarySearch.search(products, 103);

        if (binaryResult != null) {
            System.out.println("Product Found");
            System.out.println(binaryResult);
        } else {
            System.out.println("Product Not Found");
        }

    }

}
