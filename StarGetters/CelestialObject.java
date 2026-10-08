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

     public double setX(double newx) {
        return this.X = newx;
    }

    public double setY(double newy) {
        return this.Y = newy;
    }



    public double setZ(double newz) {
        return this.Z = newz;
    }

    public String setName(String newname) {
        return this.name = newname;
    }

}