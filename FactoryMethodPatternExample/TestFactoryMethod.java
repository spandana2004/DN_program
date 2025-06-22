import factories.*;
import documents.*;

public class TestFactoryMethod {
    public static void testFactory(DocumentFactory factory) {
        Document doc = factory.createDocument();
        doc.open();
    }
}
