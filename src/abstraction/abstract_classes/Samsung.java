package abstraction.abstract_classes;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Samsung extends Phone{

    public static final String OS = "Android";
    public Samsung() {

    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void ring () {
        System.out.println("Samsung rings");
    }

    @Override
    public void text() {
        System.out.println("Samsung Texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }


}
