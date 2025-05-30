package ss7_lop_truu_tuong_va_interface.bai_tap.resize;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[5];
        resizeables[0] = new Circle(5);
        resizeables[1] = new Retangle(4,5);
        resizeables[2] = new Square(9);
        resizeables[3] = new Circle(8);
        resizeables[4] = new Square(5);

        Random rand = new Random();

        for (Resizeable resizeable : resizeables) {
            double percent = 1 + rand.nextInt(100); // random từ 1 đến 100

            double oldArea = getArea(resizeable);
            resizeable.resize(percent);
            double newArea = getArea(resizeable);

            System.out.println("Before resize: Area = " + oldArea);
            System.out.println("Resize by " + percent + "%");
            System.out.println("After resize: Area = " + newArea);
            System.out.println("--------------------------------");
        }
    }

    public static double getArea(Resizeable resizeable) {
        if (resizeable instanceof Circle) {
            return ((Circle) resizeable).getArea();
        } else if (resizeable instanceof Retangle) {
            return ((Retangle) resizeable).getArea();
        } else if (resizeable instanceof Square) {
            return ((Square) resizeable).getArea();
        }
        return 0;
    }
    }

