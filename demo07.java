package ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
* 用一个大集合存入20个随机数，然后筛选其中的偶数放入小集合*/
public class demo07 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;
            list.add(num);
        }
        ArrayList<Integer> list1=getSamllList(list);
        System.out.println(list1);
    }
public static ArrayList<Integer> getSamllList(ArrayList<Integer> list){
        //创建一个小集合用来装偶数
    ArrayList<Integer>samList=new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
        int num=list.get(i);
        if (num%2==0){
            samList.add(num);
        }

    }

    return samList;
}


    }


