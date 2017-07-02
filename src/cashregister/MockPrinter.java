package cashregister;

public class MockPrinter extends Printer{
    private boolean isPrinted = false;

    @Override
    public void print(String printThis){
        isPrinted = true;
    }

    public boolean isPrinterCalled(){
        return isPrinted;
    }
}
