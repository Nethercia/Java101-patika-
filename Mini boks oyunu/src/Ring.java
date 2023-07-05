public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int i = 1;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        System.out.println("======= KARŞILAŞMA BAŞLIYOR ======");
        if (CheckWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("\n==== " + i++ + ". Raunt ====");
                double attackFirst = Math.random() * 1;
                if (attackFirst < 0.5) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                }
                if (isWin()) {
                    break;
                }
                printscore();
            }
        }
    }

    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println(f1.name + " Nakavt oluyor");
            System.out.println("Maçı kazanan = " + f2.name);
            return true;
        }
        if (f2.health <= 0) {
            System.out.println(f2.name + " Nakavt oluyor");
            System.out.println("Maçı kazanan = " + f1.name);
            return true;
        }
        return false;
    }

    public boolean CheckWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public void printscore() {
        System.out.println("--------------------------------");
        System.out.println(f1.name + "\tKalan can = \t" + f1.health);
        System.out.println(f2.name + "\tKalan can = \t" + f2.health);
        System.out.println("--------------------------------");
    }
}
