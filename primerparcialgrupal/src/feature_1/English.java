package feature_1;

import core.EBook;

public class English implements ITranslate{
    @Override
    public EBook translate(EBook ebook) {
        // Traducimos el libro
        return ebook;
    }
}
