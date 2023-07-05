import java.util.Random;
public class Fighter {
    String name;
    int damage;
    int weight;
    int health;
    double dodge;
    Random random = new Random();

    public Fighter (String name, int health, int weight, double dodge){
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    public int hit(Fighter foe){
        damage = random.nextInt(99) + 1;
        System.out.println(this.name + " ==> " + foe.name + " " + this.damage + " hasar vurdu !");
        if (foe.isDodge()){
            System.out.println("------"+foe.name+ " Gelen hasarı savundu------");
            return foe.health;
        }
        if (foe.health - this.damage == 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    public boolean isDodge(){
        double randomvalue = Math.random() * 100;
        return randomvalue <= this.dodge;
    }
}

