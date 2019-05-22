public class Point3D extends Point2D{
    private float z = 0;

    Point3D() {

    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ (float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ () {
        float[] XYZ = new float[3];
        XYZ[0] = x;
        XYZ[1] = y;
        XYZ[2] = z;
        return XYZ;
    }

    @Override
    public String toString() {
        return "A Point3D co toa do "
                + getXYZ()[0]
                +","
                +getXYZ()[1]
                +","
                +getXYZ()[2];
    }
}
