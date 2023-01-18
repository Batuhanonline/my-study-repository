public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonı: " + this.mpno);
        System.out.println("Bölümü: " + this.branch);
    }
}
