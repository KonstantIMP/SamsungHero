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
}
