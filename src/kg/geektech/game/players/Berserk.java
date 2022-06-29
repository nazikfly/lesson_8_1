package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
         int bossDamage = boss.getDamage() / 2;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setHealth( heroes[i].getHealth() + ((bossDamage / 5) * 2));
                break;
            }
        }
    }
}
