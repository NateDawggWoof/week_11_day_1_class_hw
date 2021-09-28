import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canPrint(){
        printer.print(2,5);
        assertEquals(90, printer.getSheets());

    }

    @Test
    public void checkPrintTrue(){
        assertEquals(true, printer.printCheck(10,2));
    }

    @Test
    public void checkPrintFalse(){
        assertEquals(false, printer.printCheck(100,2));
    }

    @Test
    public void checkFullPrint(){
        printer.fullPrint(10,2);
        assertEquals(80,printer.fullPrint(10,2));
    }


}
