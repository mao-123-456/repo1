package ArrayList;

import java.util.ArrayList;

/*E为泛型所指的引用数据类型
* ArrayList常用方法：
* public boolean add(E e);向集合当中添加元素，参数的类型和泛型一致
* public E get(int index);从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
* public E remove(int index);从集合当中删除元素。参数是索引编号，返回值就是被删除的元素。
* public int size();获取集合的尺寸长度，返回值就是集合中包含的元素个数
* */
public class demo02 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        //向集合中添加元素
        boolean s=list.add("留言");
        //对于ArrayList集合来说添加一定是成功的所以返回值可用可以不用，但是其他集合不一定添加成功
        System.out.println("添加的动作是否成功："+s);
        list.add("gao");
        list.add("lim");
        list.add("zhao");
        list.add("huang");
        //从集合中获取元素
        String name=list.get(2);
        System.out.println("第二号索引位置是："+name);
        //从集合中删除元素
        String remove = list.remove(3);
        System.out.println("被删除的人是："+remove);
        System.out.println(list);
        //获取集合长度
        int size=list.size();
        System.out.println("集合的长度是："+size);
        //遍历集合
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
