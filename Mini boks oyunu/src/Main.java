public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Tyson", 100, 98, 45);
        Fighter f2 = new Fighter("Ali", 100, 102, 40);

        Ring r = new Ring(f1, f2, 85, 105);
        r.run();
    }
}
