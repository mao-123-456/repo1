package ArrayList;

import java.util.ArrayList;

//定义四个学生对象，添加到集合并遍历
public class demo05 {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<Student>();
        Student one=new Student("红旗7",20);
        Student two=new Student("红旗8",20);
        Student three=new Student("红旗9",20);
        Student four=new Student("红旗10",20);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.print("姓名："+stu.getName()+"\t");
            System.out.println("年龄："+stu.getAge());
        }
    }
}
