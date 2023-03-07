package CategoryManager;

public class NotebookCategory extends Category{


    public NotebookCategory(String screenSize, String storage, String RAM, String color) {
        super(2, "Notebook");
        setScreenSize(screenSize);
        setStorage(storage);
        setRAM(RAM);
        setColor(color);
    }
}
