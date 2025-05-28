package ss6_ke_thua.bai_tap.bai_tap_3;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "("
                + getX()
                + ","
                + getY()
                + ") ,"
                +"speed =(" + xSpeed
                + ", "
                + ySpeed +
                ')';
    }

    public static void main(String[] args) {
        MovablePoint m = new MovablePoint();
        m.setX(0.1f);
        m.setY(1.1f);
        m.setxSpeed(0.1f);
        m.setySpeed(0.2f);
        System.out.println(m);
    }
}
