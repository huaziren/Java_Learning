package test_9_4;
class Student2 {
    private String name;
    private int age;
    private double score;

    Student2(String name, int age, double score) {
        this.name = name;
        setAge(age);
        this.score = score;
    }
    
    int getAge() {
        return age;
    }
    
    void setAge(int age) {
        if (age < 0) {
            System.out.println("年龄不能为负数");
        } else {
            this.age = age;
        }
    }

    void introduce() {
        System.out.println("我叫" + name + ", 今年" + age + "岁, 成绩是" + score);
    }
}



public class Test4 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("张三", -5, 92.5);
        Student2 s2 = new Student2("李四", -20, 89.5);
        Student2 s3 = new Student2("王五", 18, 95.0);
        s1.introduce();
        s2.introduce();
        s3.introduce();
        if (s3.getAge() >= 18) {
            System.out.println("王五已经成年了");
        }
    }
}
