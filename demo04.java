package ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
* 生成6个1到33之间的随机整数，添加到集合，并遍历*/
public class demo04 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i=0;i<6;i++){
            int num= r.nextInt(33)+1;
            list.add(num);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
