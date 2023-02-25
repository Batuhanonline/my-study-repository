public class Lecturer extends Academician{
    private String doorNum;
    public Lecturer(String name, String phone, String mail, String department, String title, String doorNum) {
        super(name, phone, mail, department, title);
        this.doorNum = doorNum;
    }

    public String getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(String doorNum) {
        this.doorNum = doorNum;
    }
}
