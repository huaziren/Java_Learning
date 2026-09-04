class Student {
    String name;
    int age;
    double score;
    
    void exam(double s) {
        score = s;
    }
    void introduce() {
        System.out.println("我叫" + name + ", 今年" + age + "岁, 成绩是" + score);
    }
}
 
public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "张三";
        s1.age = 20;
        s1.score = 93.5;
        s1.exam(90.5);
        s2.name = "李四";
        s2.age = 21;
        s2.score = 88.0;
        s2.exam(85.0);
        s1.introduce();
        s2.introduce();
    }
}