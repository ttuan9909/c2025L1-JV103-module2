package ss7_lop_truu_tuong_va_interface.thuc_hanh;

import ss7_lop_truu_tuong_va_interface.thuc_hanh.animal.Animal;
import ss7_lop_truu_tuong_va_interface.thuc_hanh.animal.Chicken;
import ss7_lop_truu_tuong_va_interface.thuc_hanh.animal.Tiger;
import ss7_lop_truu_tuong_va_interface.thuc_hanh.fruit.Apple;
import ss7_lop_truu_tuong_va_interface.thuc_hanh.fruit.Fruit;
import ss7_lop_truu_tuong_va_interface.thuc_hanh.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
