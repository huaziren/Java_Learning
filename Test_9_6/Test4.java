package test_9_6;
class Animal2 {
    private String name;
    
    Animal2(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " 在吃东西");
    }
}

class Dog2 extends Animal2 {
    Dog2(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(getName() + " 在吃狗粮");
    }
    void bark() {
        System.out.println(getName() + " 汪汪叫");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Dog2 d = new Dog2("旺财");
        d.eat();
        d.bark();
    }
}
