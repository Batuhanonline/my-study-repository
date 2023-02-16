public class Employe {
    private String name;
    private String phone;
    private  String mail;

    public  Employe(String name, String phone, String mail){
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void enter() {
        System.out.println(this.name + "Üniversiteye girdi.");
    }

    public void exit() {
        System.out.println(this.name + "Ünversiteden çıktı.");
    }

    public  void dining() {
        System.out.println(this.name + "Yemekhaneye girdi.");
    }
}
