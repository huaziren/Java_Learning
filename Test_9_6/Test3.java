class Animal {
    private String name;
    
    Animal() {
        System.out.println("Animal 的构造方法执行了");
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
    Dog(){
        S
    }

    @Override
    void eat() {
        System.out.println(getName() + " 在吃狗粮");
    }
    void bark() {
        System.out.println(getName() + " 汪汪叫");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("旺财");
        d.eat();
        d.bark(); 
    }
}
