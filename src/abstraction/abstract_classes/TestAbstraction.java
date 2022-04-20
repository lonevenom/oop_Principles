package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        /*
        Create an object of Samsung called as s1
        info it will have is as below

        Samsung
        Black
        64
        700
         */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        /*
        Print all objects
        Find and print the most expensive one with the message, "The most expensive is = "\
        Find and print how many phones are convertible -> 2
         */

        System.out.println(s1);
        System.out.println(n1);
        System.out.println(i1);
        int price = Integer.MIN_VALUE;
        Phone maxPrice = null;
        int countConvertibles = 0;
        for (Phone object: phones) {
            if (object.isConvertible()) countConvertibles++;
            if (object.price > price) {
                price += object.price;
                maxPrice = object;
            }
        }
        System.out.println(countConvertibles);
        System.out.println("The most expensive is = " + maxPrice);
        System.out.println(Iphone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for (Phone object : phones) {
            object.call();
            object.ring();
            object.text();
        }







    }
}
