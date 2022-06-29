package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int dam= RPG_Game.random.nextInt(6) - 2;
        boss.setHealth(boss.getHealth()-this.getDamage() * dam);
        System.out.println("Warrior использовал критический удар" + this.getDamage() * dam);
    }
}
