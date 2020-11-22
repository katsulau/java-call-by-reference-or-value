package mutableOrImmutable;

public class Immutable {
    private final String  name;

    private final int age;

    Immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


    public Immutable incrementAge() {
        return new Immutable(this.name, this.age + 1);
    }

    // finalな変数なためできない
//    public void incrementAge() {
//        this.age++;
//    }
}
