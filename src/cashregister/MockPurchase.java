package cashregister;

public class MockPurchase extends Purchase {

    public MockPurchase() {
        super(null);
    }

    @Override
    public String asString() {
        return "I am getting printed.";
    }
}
