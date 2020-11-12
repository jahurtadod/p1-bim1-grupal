package feature_3;

import core.EBook;

import java.io.File;

public class EbookExporter {
    private EBook ebook;
    private IExportable exportable;

    public EbookExporter(EBook ebook, IExportable exportable) {
        this.ebook = ebook;
        this.exportable = exportable;
    }

    public File exportable() {
        return exportable.exportable(ebook);
    }
}
