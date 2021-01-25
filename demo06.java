package ArrayList;

import java.util.ArrayList;

/*
* 定义指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起来，使用@分割每个元素
* 格式参照{元素@元素@元素*/
public class demo06 {
    public static void main(String[] args) {
        ArrayList<String>lis=new ArrayList<>();
        lis.add("张");
        lis.add("zhao");
        lis.add("wang");
        lis.add("mao");
        printArrayList(lis,"-");

    }
    public  static void printArrayList(ArrayList<String>list ,String a){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i<list.size()-1){
                System.out.print(a);
            }else{
                System.out.println("}");
            }
        }
    }
}
