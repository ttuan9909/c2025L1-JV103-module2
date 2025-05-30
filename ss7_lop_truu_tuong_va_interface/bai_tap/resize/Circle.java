package ss7_lop_truu_tuong_va_interface.bai_tap.resize;

public class Circle implements Resizeable {
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent/100;
    }

    @Override
    public String toString() {
        return "Circle with radius=" + radius;
    }
}
