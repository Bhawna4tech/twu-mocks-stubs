package cashregister;

import cashregister.Purchase;

public class MockPurchase extends Purchase {

    public MockPurchase() {
        super(null);
    }

    @Override
    public String asString() {
        return "I am getting printed.";
    }
}
