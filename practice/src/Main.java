
/*学生管理系统
1、要有选择 能选增删改查 或者其他错误输入
2、写增删改查功能

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //创建一个集合数组来存储学生的信息，后面可以改为用数据库
        //集合的每个单元类型为student
        ArrayList<Course> list=new ArrayList<Course>();

        //加一个循环让可以选择多次
       loop: while (true) { //给while循环起名叫loop 为了下面break好用
            System.out.println("----------------学生管理系统---------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
           System.out.println("5:输出学生成绩平均分");
           System.out.println("6:退出");
            System.out.println("请输入您的选择！！！");

            Scanner sc = new Scanner(System.in);
            String i = sc.next();// 录入键盘 也为了防止是否键入不合适的值
//判断是选择的什么功能以及是否输入了错误
            switch (i) {
                case "1" -> student.addstudy(list);//增加学生功能
                case "2" -> student.deletestudy(list);   //删除学生功能
                case "3" -> student.modifystudy(list);//修改学生功能
                case "4" -> student.querystudy(list);//查询学生功能
                case"5"->Coursesystem.Coursesystem(list);//成绩系统
                case "6" -> {
                    System.out.println("退出！！！");
                    break loop;//跳出while循环
                }//退出功能
                default -> System.out.println("输入错误，请选择正确功能！！");
            }


        }
    }
}