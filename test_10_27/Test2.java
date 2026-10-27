package test_10_27;
//抽象类
//不许new， 只能当爹，被继承
//规定儿子必须会某个方法，不能被实例化

public class Test2 {
    public static void main(String[] args) {
        Animal2 a1 = new Dog2();
        Animal2 a2 = new Cat2();
        //Animal2 a3 = new Animal2();  //抽象类不能被实例化

        a1.speak();
        a2.speak();
    }
}


abstract class Animal2 { //abstract = 抽象类，不能new
    abstract void speak(); //抽象方法，只有名字没有身体，用;结尾，没有{}
}

class Dog2 extends Animal2 {
    void speak() { //子类必须写speak,否则报错
        System.out.println("Dog2 barks");
    }
}

class Cat2 extends Animal2 {
    void speak() {
        System.out.println("Cat2 meows");
    }
}


//抽象类：固定的模板，规定子类必须有某个方法，不能被实例化
//1.不能实例化，不能new
//2.规定子类必须有某个方法，不完成就报错