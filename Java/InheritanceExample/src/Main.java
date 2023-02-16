public class Main {
    public static void main(String[] args) {
        Lecturer l1 = new Lecturer("Batuhan Güven", "030400202", "batuhan@mail.com", "ING", "Doçent", "021");
        System.out.println(l1.getDoorNum() + l1.getName());
    }
}