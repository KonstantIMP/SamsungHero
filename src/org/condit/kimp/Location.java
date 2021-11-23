package org.condit.kimp;

public class Location {
    private double x, y, z;

    public Location() {
        x = y = z = 0.0;
    }

    public Location(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
}