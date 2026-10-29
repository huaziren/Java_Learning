//List: 像排队，有下标，而且可以有重复的人
//set : 像集合，没有第几个的概念，而且同样的东西只存一份（自动去重）
//Set是一个接口，HashSet是它的实现类


import java.util.Set;
import java.util.HashSet;


public class test1 {
    public static void main(String[] args) {
        //创建一个装String的空集合
        Set<String> names = new HashSet<>();
        names.add("Alice");//加第一个
        names.add("Bob");//加第二个
        names.add("Alice");//重复的，Set会自动去重
        names.add("Mike");//加第三个
        names.add("Tom");//加第四个
        
        System.out.println(names.size());//打印集合的长度
        
        //contains: 判断集合里“有没有”某个元素，如果存在则返回true，否则返回false
        System.out.println(names.contains("Alice"));
        //remove: 删除集合里的某个元素
        //按照元素删除，不能按下标删除，因为Set没有下标
        names.remove("Alice");
        System.out.println(names.contains("Alice"));
        System.out.println(names.size());//删掉Alice后剩几个

        //遍历，只能用增强for循环，因为Set没有下标
        for (String name : names) {
            System.out.println(name);
        }
    }   
}
