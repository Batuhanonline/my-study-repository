public class Officer extends Employe {
    private String departman;
    private String shift;

    public Officer(String name, String phone, String mail, String departman, String message) {
        super(name, phone, mail);
        this.departman = departman;
        this.shift = message;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMessage() {
        return shift;
    }

    public void setMessage(String message) {
        this.shift = message;
    }

    public void work() {
        System.out.println(this.getName() + " memur çalışmaya başladı.");
    }
}
