package feature_4;

import core.EBook;

public class ScreenAdapter {
    Screen screen;
    EBook ebook;

    public ScreenAdapter(Screen screen, EBook ebook) {
        this.screen = screen;
        this.ebook = ebook;
    }
    
    public void render(){
        this.screen.render(this.ebook);
    }

}
