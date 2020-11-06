package Dia3;

/**
 *
 * @author matheus
 */
public class Casting {

    public static void main(String[] args) {

        double myDouble = 9.78;
        int myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);

        long myLong = 100L;
        short myShort = (short) myLong;

        System.out.println(myLong);
        System.out.println(myShort);
    }
}
