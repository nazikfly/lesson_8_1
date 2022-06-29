package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Thor extends Hero{

    public Thor(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
            boolean s=RPG_Game.random.nextBoolean() ;

        for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth()> 0 && s) {
                    int bossDamage = 0;
                    break;

                }
            }

        }
    }
}

