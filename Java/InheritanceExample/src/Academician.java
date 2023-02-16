public class Academician extends Employe{
    private String department;
    private String title;
    public Academician(String name, String phone, String mail, String department, String title) {
        super(name, phone, mail);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void attendClass() {
        System.out.println(this.getName() + " Derse giriş yaptı.");
    }
}
