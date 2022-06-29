package kg.geektech.game.players;

public class Golem {

    public static void GolemSkill() {
        if (heroesHealth[4] < 0 ) {
            heroesHealth[4] = 0;
        }
        int dmg = bossDamage / 5;
        int howAliveHerro = 0;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (i == 4) {
                continue;
            } else if (heroesHealth[i] > 0) {
                howAliveHerro++;
                heroesHealth[i] += dmg;
            }
            heroesHealth[4] -= dmg * howAliveHerro;
            System.out.println(" Golem took damage: " + dmg * howAliveHerro);
            break;

        }
