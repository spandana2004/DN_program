public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shampoo", "Beauty"),
            new Product(3, "Notebook", "Stationery"),
            new Product(4, "Mouse", "Electronics"),
            new Product(5, "Table", "Furniture")
        };

        Product foundLinear = SearchUtils.linearSearch(products, "Mouse");
        System.out.println("Linear Search: " + (foundLinear != null ? foundLinear : "Not Found"));

        Product foundBinary = BinarySearchUtils.binarySearch(products, "Mouse");
        System.out.println("Binary Search: " + (foundBinary != null ? foundBinary : "Not Found"));
    }
}