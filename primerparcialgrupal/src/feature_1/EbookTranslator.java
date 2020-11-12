package feature_1;

import core.EBook;

public class EbookTranslator {
    private  ITranslate translator;

    public EbookTranslator(ITranslate translator) {
        this.translator = translator;
    }

    public EBook translate(EBook ebook) {
        return translator.translate(ebook);
    }
}
