
public class Weapon {
    private Weapontype weaponType;
    private String weaponName;

    public Weapon(WeaponType weaponType, String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }
    public Weapontype getWeaponType() {
        return weaponType;
    }
    public void setWeaponType(Weapontype weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;

    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
