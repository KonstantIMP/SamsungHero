package org.condit.kimp;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    private static Random rand = new Random();

    public static void main(String[] args) {
	    Hero a = new Hero(HeroType.MAN);
        Hero b = new Hero(HeroType.VAMPIRE);

        a.setGold(350); b.setGold(7200);
        a.setDamageLevel(25); b.setDamageLevel(97);
        a.setLocation(new Location(12, 14, 22));
        b.setLocation(new Location(56, 12, 22));
        a.setHealth(200); b.setHealth(9000);
        a.addItem("Helmet"); a.addItem("Sword");
        a.addItem("Horse");
        b.addItem("Castle"); b.addItem("Book");

        out.println(a + "" + b);

        for (int i = 0; i < 10; i++) {
            int r = rand.nextInt() % 7;
            if (r == 0) {
                out.println(a.getType() + " found a frog");
                a.addItem("Frog");
            }
            else if (r == 1) {
                out.println(b.getType() + " found a villager. The villager was eaten");
                b.addExperience(100); b.setHealth(b.getHealth() + 25);
            }
            else if (r == 2) {
                out.println(a.getType() + " found " + b.getType() + ": attack");
                b.attack(a.getDamageLevel());
            }
            else if (r == 3) {
                out.println(b.getType() + " found " + a.getType() + ": someone died");
                a.kill(); b.addExperience(400); break;
            }
            else if (r == 4) {
                out.println(b.getType() + " saw a Sun: damage");
                b.attack(1000);
            }
            else if (r == 5) {
                out.println(a.getType() + " found a magick jacket");
                a.setHealth(a.getHealth() + 1000);
            }
            else if (r == 6) {
                out.println(a.getType() + " killed " + b.getType());
                b.kill(); break;
            }
        }

        out.println(a + "" + b);
    }
}
