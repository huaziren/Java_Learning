class Student {
    String name;
    static int count;

    static void showName() {
        System.out.println(name);
    }
    
    Student(){
        count++;
    }

}

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student.showName();
    }
}
