public class CelestialObject {
    public double X;
    public double Y;
    public double Z;
    public String name = "Soleil";

    public double getX() {
        return this.X;
    }

    public double getY() {
        return this.Y;
    }

    public double getZ() {
        return this.Z;
    }

    public String getName() {
        return this.name;
    }

     public void setX(double newx) {
        this.X = newx;
    }

    public void setY(double newy) {
        this.Y = newy;
    }



    public void setZ(double newz) {
        this.Z = newz;
    }

    public void setName(String newname) {
        this.name = newname;
    }

}