package test_10_27;
public class Test1 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        a1.speak();
        a2.speak();
        a3.speak();

        Animal[] arr = {new Dog(), new Cat(), new Animal()
        };
        for (Animal a : arr) {
            a.speak();
        }
    }
}

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {  //extends = 继承，直接拿Animal的speak
    void speak() {  //同名同参 = 重写，把父类的盖掉
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void speak() {
        System.out.println("Cat meows");
    }
}


//看变量没用，看对象。 new 出来的是谁，就调用谁

//多态：创建一个父类变量，子类用extends继承父类，当对象是父类时调用父类，对象是子类是调用子类