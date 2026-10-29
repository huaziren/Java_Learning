//package test_10_29;
//ListDemo
//List:纯规矩，只规定一个列表该有哪些操作
//List 就是能自动变长的数组
//ArrayList:有血有肉，继承List，重写了里面的方法，自己实现了这些方法的具体功能


//从Java.util包中导入ArrayList类
import java.util.List;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); //创建一个装String的空列表
        names.add("Alice"); //向列表中添加元素,加第一个，自动排在0号位
        names.add("Bob"); //加第二个，自动排在1号位
        names.add("Mike"); //加第三个，自动排在2号位
        names.add("jarry"); //加第四个，自动排在3号位
        names.add("Tom"); //加第五个，自动排在4号位

        names.remove(1); //移除索引为1的元素
        names.remove(3); //移除索引为3的元素
        //删除后，Bob被移除了，Mike自动排在1号位
        //List删了会自动挪，长度也跟着减

        //用for循环从头打印
        //for (int i = 0; i < names.size(); i++) {
            //长度用.size(),不是.length(是数组的)
            //取值用get(i),不是name[i](是数组的)，这是和数组最大的区别
         //   System.out.println(names.get(i)); //get(i)获取第i号位的元素
        //}
        
        //用增强for循环从头打印
        //以此把列表里每个元素递给name，从头到尾走一边
        for (String name : names) {
            System.out.println(name);
        }
    }
}
