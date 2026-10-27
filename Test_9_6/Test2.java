package test_9_6;
class Student {
    String name;
    static int count;

    static void showName() {
        System.out.println("学生的数量是：" + count);
    }
    
    Student(){
        count++;
    }


    Student(String name) {
        this.name = name;
        count++;
    }
}
    

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student("小明");
        Student.showName();
    }
}
