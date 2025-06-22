import factories.*;

public class Main {
    public static void main(String[] args) {
        TestFactoryMethod.testFactory(new WordFactory());
        TestFactoryMethod.testFactory(new PdfFactory());
        TestFactoryMethod.testFactory(new ExcelFactory());
    }
}
