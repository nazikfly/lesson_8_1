package kg.geektech.game.general;

import kg.geektech.game.players.*;

import java.util.Random;

public class RPG_Game {

    private static int roundNumber;
    public static Random random = new Random();

    public static void startGame() {
        Boss boss = new Boss("Tanos", 1000, 50);

        Warrior warrior = new Warrior("Alfa", 280, 10);
        Magic magic = new Magic("Strange", 250, 20);
        Medic doc = new Medic("Doc", 230, 5, 15);
        Berserk berserk = new Berserk("Ragnar", 270, 15);
        Medic assistant = new Medic("Potter", 300, 10, 5);
        Hero[] heroes = {warrior, magic, doc, berserk, assistant};

        printStatistics(boss, heroes);

        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println(roundNumber + " ROUND ____________");
        System.out.println("BOSS " + boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    private static void round(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence(heroes);
        boss.hit(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getDefenceType() != heroes[i].getAbilityType()) {
                heroes[i].hit(boss);
                heroes[i].applySuperPower(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }
}
