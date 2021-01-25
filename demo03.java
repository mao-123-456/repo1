package ArrayList;

import java.util.ArrayList;

/*
* 解决办法：
* 如果希望向集合ArrayList当中存储基本类型数据。必须使用基本类型的“包装类”
* 基本类型       包装类（引用类型，包装类都位于java.lang包下
* byte              Byte
* short             Short
* int               Integer
* float             Float
* double            Double
* char              Character
* boolean           Boolean
*
* 从JDK1.5开始/支持自动装箱、自动拆箱
* 自动装箱：基本类型---->包装类型
* 自动拆箱：包装类型---->基本类型*/
public class demo03 {
    public static void main(String[] args) {
        //错误写法！泛型只能是引用类型，不能是基本类型；因为数组存储的是地址值，基本数据类型没有地址值
        //ArrayList<int> list=new ArrayList<int>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);
        int num=list.get(1);
        System.out.println("第1号元素是："+num);
    }
}
