public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
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

}