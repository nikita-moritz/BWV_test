package de.gypsilon.java_1;


public class Counter {
    String name="name1";
    int age;

    public Counter(String name) {
        this.name = "name2";
        this.age = 18;

    }

    public Counter(String name, int age) {
        this.name = "name3";
        this.age = 21;

    }

    public static void counter() {
        Counter newUser = new Counter("",0);

        System.out.println(newUser.name+"  "+newUser.age);

    }
}