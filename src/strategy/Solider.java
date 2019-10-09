package strategy;

public class Solider {

    Weapon weapon;

    public void setWeapon(int weaponType){
        switch (weaponType) {
            case 1:
                weapon = new Bow();
                break;
            case 2:
                weapon = new Gun();
                break;
            case 3:
                weapon = new Knife();
                break;
            default:
                break;
        }
    }

    public void use(){
    	weapon.attack();
    }
}