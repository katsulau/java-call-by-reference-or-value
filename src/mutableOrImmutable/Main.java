package mutableOrImmutable;

public class Main {

    public static void main(String[] args) {
        Mutable mutable = new Mutable("mutableです", 1);

        Immutable immutable = new Immutable("immutableです", 1);

        addAge(mutable, immutable);

        System.out.println("↓ここから下は呼び出し元");
        System.out.println(mutable.getAge());
        System.out.println(immutable.getAge());

    }

    static void addAge(Mutable mutable, Immutable immutable) {
        mutable.incrementAge();

        immutable = immutable.incrementAge();

        System.out.println("↓ここから下はaddAgeメソッド内");
        System.out.println(mutable.getAge());
        System.out.println(immutable.getAge());
    }
}
