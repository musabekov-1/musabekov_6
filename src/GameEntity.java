public class GameEntity {
    private String name;
    private int health;
    private int damage;
    private int armor;

    public GameEntity(String name,int health,int damage, int armor) {
        this.name = name;
        this.health=health;
        this.damage=damage;
        this.armor=armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
