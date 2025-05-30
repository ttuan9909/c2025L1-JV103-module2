package ss7_lop_truu_tuong_va_interface.bai_tap.resize;

public class Square implements Resizeable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    @Override
    public void resize(double percent) {
        side += percent/100 * side;
    }

    @Override
    public String toString() {
        return "Square side=" + side;
    }
}
