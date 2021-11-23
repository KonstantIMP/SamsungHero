package org.condit.kimp;

import java.util.LinkedList;

public class Hero {
    private int experience, damageLevel;
    private int health, speed, gold;

    private HeroType type;

    private Location location;

    private LinkedList<String> items;

    public Hero(HeroType t) {
        type = t;
        experience = gold = 0;
        health = 100; damageLevel = speed = 10;
        location = new Location();
        items = new LinkedList<>();
    }

    public Hero(HeroType t, Location l) {
        this(t); location = new Location(l);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public HeroType getType() {
        // You can choose it once
        return type;
    }

    public int getExperience() {
        return experience;
    }

    public void addExperience(int ex) {
        // You can only add some points
        experience += ex;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public LinkedList<String> getItems() {
        return items;
    }

    public void addItem(String name) {
        items.add(name);
    }

    public boolean removeItem(String name) {
        for (String i : items) {
            if (name.equals(i)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void kill() {
        health = 0;
    }

    public void attack(int damage) {
        health -= damage;
    }

    public boolean buy(int cost) {
        if (gold >= cost) {
            gold -= cost;
            return true;
        }
        return false;
    }

    public void carry(Location l) {
        location = new Location(l);
    }

    public void respawn() {
        health = 100;
    }

    public void move(int x, int y, int z) {
        location.setX(location.getX() + x);
        location.setY(location.getY() + y);
        location.setZ(location.getZ() + z);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Hero: ");

        switch (type) {
            case ELF -> builder.append("ELF");
            case MAN -> builder.append("MAN");
            case ORC -> builder.append("ORC");
            case VAMPIRE -> builder.append("VAMPIRE");
            case WEREWOLF -> builder.append("WEREWOLF");
        } builder.append("\n");

        builder.append("\tHealth: ");
        builder.append(String.valueOf(health));
        builder.append("\tDamage level: ");
        builder.append(String.valueOf(damageLevel));
        builder.append("\tSpeed: ");
        builder.append(String.valueOf(speed));
        builder.append("\tExperience: ");
        builder.append(String.valueOf(experience));

        builder.append("\tLocation: ");
        builder.append(String.valueOf(location.getX())).append(":");
        builder.append(String.valueOf(location.getY())).append(":");
        builder.append(String.valueOf(location.getZ()));

        builder.append("\tItems: [");
        for (int i = 0; i < items.size(); i++) {
            builder.append(items.get(i));
            if (i + 1 != items.size()) builder.append(", ");
        } builder.append("]\n");

        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hero hero = (Hero) o;

        if (experience != hero.experience) return false;
        if (damageLevel != hero.damageLevel) return false;
        if (health != hero.health) return false;
        if (speed != hero.speed) return false;
        return type == hero.type;
    }
}
