public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
    }

    void addVerbalNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.verbal = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.verbal = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            this.c3.verbal = note3;
        }
    }

    void isPass(){
        this.avarage = (((this.c1.note * 0.80) + (this.c1.verbal * 0.20)) + ((this.c2.note * 0.80) + (this.c1.verbal * 0.20)) + ((this.c3.note * 0.80) + (this.c1.verbal * 0.20))) / 3.0;
        if (this.avarage > 55){
            System.out.println("Tebrikler sınıfı geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldı.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Sınav Notu\t:" + c1.note + " Sözlü Notu\t:" + c1.verbal);
        System.out.println(this.c2.name + " Sınav Notu\t:" + c2.note + " Sözlü Notu\t:" + c2.verbal);
        System.out.println(this.c3.name + " Sınav Notu\t:" + c3.note + " Sözlü Notu\t:" + c3.verbal);
        System.out.println("Ortalaması: " + avarage);
    }
}
