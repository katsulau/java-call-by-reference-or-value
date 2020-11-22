package mutableOrImmutable;

public class Mutable {

    private String name;
    private int age;


    Mutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void incrementAge() {
        this.age++;
    }
}
