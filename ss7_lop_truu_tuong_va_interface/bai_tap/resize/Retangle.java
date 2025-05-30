package ss7_lop_truu_tuong_va_interface.bai_tap.resize;

import java.awt.*;

public class Retangle implements Resizeable {
    private double width;
    private double height;

    public Retangle() {
    }

    public Retangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        width += percent/100 * width;
        height += percent/100 * height;
    }

    @Override
    public String toString() {
        return "Retangle with width = " + width +
                ", height = " + height;
    }
}
