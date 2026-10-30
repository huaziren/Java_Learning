//List : 有下表，可以重复,一列东西
//Set : 没下标，无顺序，自动去重，一堆东西

//Map: 用键快速查找值，相当于一本字典
//containsKey: 判断键在不在，在才去get；

//size() = 里面有几对 （键值对，不是一个值算一个）
//remove(key) = 按键删掉一整队

//与Set的区别，Set的remove是按值删掉一个，Map的remove是按键删掉一整对

//KeySet:没有下标，不能用for(int i...),但是可以用for-each

//entrySet:更正规，一步到位，直接拿到键值对，不用get


import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        //创建一个空的Map集合，键是String(字符串)类型，值是Integer(整数）类型
        Map<String, Integer> scores = new HashMap<>();

        //put: 往Map里添加键值对
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Mike", 95);
        
        //get: 根据键获取值
        System.out.println(scores.get("Alice"));
        System.out.println(scores.get("Bob"));


        scores.put("Bob", 88); //如果键重复，后面的值会覆盖前面的值
        System.out.println(scores.get("Bob"));

        //get一个没存过的键，返回什么?
        //System.out.println(scores.get("Tom"));//null

        //containsKey:先判断在不在
        if (scores.containsKey("Alice")) {
            System.out.println("Alice的分数是：" + scores.get("Alice"));
        } else {
            System.out.println("查无此人");
        }
        
        if (scores.containsKey("小明")) {
            System.out.println("小明的分数是：" + scores.get("小明"));
        } else {
            System.out.println("查无此人");
        }

        //size: 获取Map中键值对的数量
        System.out.println(scores.size());

        //remove: 按键删除一整对
        scores.remove("Mike");
        System.out.println(scores.size());

        System.out.println(scores.get("Mike"));

        //keySet:返回所有键，for-each一个个拿键
        for (String name : scores.keySet()) {
            //先拿键name, 再用get取值
            System.out.println(name + " -> " + scores.get(name));
        }

        //entrySet:返回所有键值对，类型叫Map.Entry
        for (Map.Entry<String, Integer> e : scores.entrySet()) {
            //e就是一对，getKey()拿键，getValue()拿值
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}