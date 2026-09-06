class Animal {
    private String name;
    
    Animal(String name) {
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

class Dog extends Animal {
    Dog(String name) {
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
        Dog d = new Dog("旺财");
        d.eat();
        d.bark();
    }
}
