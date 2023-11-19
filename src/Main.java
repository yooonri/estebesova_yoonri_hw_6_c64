public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Great Wishap");
        boss.setCharacterHp(1000);
        boss.setAttackType("Magical");
        boss.bossWeapon.setWeaponType(WeaponType.CLAYMORE);
        boss.bossWeapon.setWeaponName("The gut of Hell");


        System.out.println("\n Boss name: " + boss.getName() + " \n Hp: " + boss.getCharacterHp() +
                " \n AttackType: " + boss.getAttackType() + " \n Weapons name : "
                + boss.bossWeapon.getWeaponName() + " \n Weapon type: " + boss.bossWeapon.getWeaponType());
    }
}