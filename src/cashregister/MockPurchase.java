package cashregister;

public class MockPurchase extends Purchase {

    public MockPurchase(Item[] items) {
        super(items);
    }

    @Override
    public String asString() {
        return "I am getting printed.";
    }
}
