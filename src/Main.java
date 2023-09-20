public class Main {
    public static void main(String[] args) {
        Boss AngryBoss = new Boss("AngryBoss", 560, 50, 60,new Weapon(WeaponType.FIREARMS, "Famas"));
        System.out.println(AngryBoss.printInfo());

    }
}
