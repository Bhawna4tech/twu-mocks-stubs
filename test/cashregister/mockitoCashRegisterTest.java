package cashregister;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class mockitoCashRegisterTest {

    Printer mockPrinter = mock(Printer.class);

    @Test
    public void cashRegisterShouldPrintPurchasesMade(){
        Item items[] = new Item[1];
        items[0]=new Item("Book",30);
        Purchase purchase = new Purchase(items);

        CashRegister cashRegister = new CashRegister(mockPrinter);
        cashRegister.process(purchase);

        verify(mockPrinter).print(purchase.asString());
    }

    @Test
    public void cashRegisterShouldPrintMockPurchaseMade() {
        Purchase mockPurchase = mock(Purchase.class);
        when(mockPurchase.asString()).thenReturn("Purchase made : Book");

        CashRegister cashRegister = new CashRegister(mockPrinter);
        cashRegister.process(mockPurchase);

        verify(mockPrinter).print("Purchase made : Book");
    }
}
