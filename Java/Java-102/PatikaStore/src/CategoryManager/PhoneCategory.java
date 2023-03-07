package CategoryManager;

public class PhoneCategory extends Category{



    public PhoneCategory(String screenSize, String batery, String RAM, String color) {
        super(1, "Phone");
        setScreenSize(screenSize);
        setBatery(batery);
        setRAM(RAM);
        setColor(color);
    }


}
