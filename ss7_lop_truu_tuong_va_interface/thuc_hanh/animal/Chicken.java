package ss7_lop_truu_tuong_va_interface.thuc_hanh.animal;

import ss7_lop_truu_tuong_va_interface.thuc_hanh.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
