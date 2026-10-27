package test_10_27;
//接口(interface)
//区别：抽象类：有血有肉，儿子extends继承，只能继承一个
//接口:纯规矩，里面只有方法名， 没有身体，类implements实现它，可以实现多个

//需要的原因:为了实现多重继承，同时实现多个

public class Test3 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}

interface Flyable { //用interface = 接口，不用class
    void fly(); //接口里的方法默认就是public
}

interface Swimable {
    void swim();
}



class Duck implements Flyable, Swimable {
    public void fly() { //实现接口方法前面要写public
        System.out.println("Duck flies");
    }

    public void swim() {
        System.out.println("Duck swims");
    }
}

