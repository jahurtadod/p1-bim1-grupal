package feature_5;

import core.EBook;

public class EbookPrinter {
    private EBook ebook;
    private IPrinter printer;

    public EbookPrinter(EBook ebook, IPrinter printer) {
        this.ebook = ebook;
        this.printer = printer;
    }

    public void print() {
        printer.print(ebook);
    }
}
