package ArrayList;

import java.util.ArrayList;

//集合
//备注：从jdk1.7开始右侧的尖括号内部可以不写内容，但<>必须写
//泛型只能是我引用类型，不能是基本类型。
public class demo01 {
    public static void main(String[] args) {
        //创建一个ArrayList集合 集合名称是list，类型是String
        ArrayList<String>list=new ArrayList<>();
//注意事项：对于ArrayList集合来说，直接打印的不是地址而是内容。如果为空得到的是空括号[]
        System.out.println(list);
        //向集合内添加数据需要add（）方法
        list.add("召开");
        list.add("333");
	list.add("第三次提交");
        System.out.println(list);
        System.out.println(list.toString());
    }
}
