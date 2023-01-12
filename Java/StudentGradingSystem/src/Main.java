public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH", "0534");
        Teacher t2 = new Teacher("Hakan", "FZK", "05343");
        Teacher t3 = new Teacher("Kemal", "BIO", "11121");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(15, 70, 50);
        s1.addVerbalNote(100,100,100);
        s1.isPass();

    }
}