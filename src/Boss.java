public class Boss extends GameEntity{

    private Weapon weapon;
    public String printInfo() {
        return "Name: " + this.getName() + " Health: " + this.getHealth() + " Damage: "
                + this.getDamage() + " Armor" + this.getArmor() + " Weapon: " + this.getWeapon().getWeaponType() + " Name Weapon: " + this.getWeapon().getWeaponName();
    }

    public Boss(String name, int health, int damage,int armor, Weapon weapon) {
        super (name, health, damage,armor);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

