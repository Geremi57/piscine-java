public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;
    
    public static final double KM_IN_ONE_AU = 150000000;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }


    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public String getName() {
        return this.name;
    }

     public void setX(double newx) {
        this.x = newx;
    }

    public void setY(double newy) {
        this.y = newy;
    }

    public void setZ(double newz) {
        this.z = newz;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public String toString() {
        String result = "";

        result = this.name + " is positioned at (" + this.x +"00" +", " + this.y+"00" +", " + this.z+"00"  + ")";

        return result;
    }

    @Override
public boolean equals(Object object) {
    if (this == object) {
        return true;
    }

    if (object == null || getClass() != object.getClass()) {
        return false;
    }

    CelestialObject other = (CelestialObject) object;

    return Double.compare(this.x, other.x) == 0
        && Double.compare(this.y, other.y) == 0
        && Double.compare(this.z, other.z) == 0
        && this.name.equals(other.name);
}

@Override
public int hashCode() {
    return java.util.Objects.hash(this.x, this.y, this.z, this.name);
}

}
