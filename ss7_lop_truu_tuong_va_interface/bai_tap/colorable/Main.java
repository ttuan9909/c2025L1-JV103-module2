package ss7_lop_truu_tuong_va_interface.bai_tap.colorable;

import ss7_lop_truu_tuong_va_interface.bai_tap.resize.Circle;
import ss7_lop_truu_tuong_va_interface.bai_tap.resize.Retangle;

public class Main {
    public static void main(String[] args) {
        Object[] shapes = new Object[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Retangle(3, 6);
        shapes[2] = new Square(5); // Square implements Colorable
        shapes[3] = new Square(7);

        for (Object obj : shapes) {
            if (obj instanceof Circle) {
                Circle c = (Circle) obj;
                System.out.println("Circle area: " + c.getArea());
            } else if (obj instanceof Retangle) {
                Retangle r = (Retangle) obj;
                System.out.println("Rectangle area: " + r.getArea());
            } else if (obj instanceof Square) {
                Square s = (Square) obj;
                System.out.println("Square area: " + s.getArea());
            }

            // Kiểm tra nếu có thể tô màu
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }

            System.out.println("----------------------------");
        }
    }
    }
