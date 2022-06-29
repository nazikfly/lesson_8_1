package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
       int FireBall = RPG_Game.random.nextInt(10);

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + FireBall);
        }
    }


        boolean s =RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (heroesHealth[7] > 0 && s) {
                bossDamage = 0;
                System.out.println("Thor suppressed the Boss" + s);
                break;
            } else {
                bossDamage = 50;
                break;
            }
        }
    }


}

