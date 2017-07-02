package cashregister;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class cashRegisterTest {

    @Test
    public void cashRegisterShouldPrintPurchasesMade(){
        Item items[] = new Item[1];
        items[0]=new Item("Book",30);
        Purchase purchase = new Purchase(items);
        MockPrinter mockPrinter = new MockPrinter();

        CashRegister cashRegister = new CashRegister(mockPrinter);
        cashRegister.process(purchase);
        assertTrue(mockPrinter.isPrinterCalled());
    }
}
