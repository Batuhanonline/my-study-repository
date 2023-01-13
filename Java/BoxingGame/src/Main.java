public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike", 30, 120, 100, 10);
        Fighter f2 = new Fighter("Ali", 20, 190, 80, 90);

        Match match = new Match(f1, f2, 80,110);
        match.run();
    }
}