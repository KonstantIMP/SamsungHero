package org.condit.kimp;

public class Location {
    private double x, y, z;

    public Location() {
        x = y = z = 0.0;
    }

    public Location(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }

    public Location(Location copy) {
        x = copy.x; y = copy.y; z = copy.z;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (Double.compare(location.x, x) != 0) return false;
        if (Double.compare(location.y, y) != 0) return false;
        return Double.compare(location.z, z) == 0;
    }
}
