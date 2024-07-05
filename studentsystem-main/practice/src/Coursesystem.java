

import java.util.ArrayList;
import java.util.Scanner;

public class Coursesystem {
    Course course = new Course();

    public static void Coursesystem(ArrayList<Course> list) {
        //求各个id的平均值
        double sum;
        for (int i=0;i<list.size();++i){
            Course stu=list.get(i);
            sum=(stu.getChinese()+stu.getHistory()+stu.getPolitics()+stu.getMath()+ stu.getEnglish())/5;
            System.out.println("ID\t\t姓名\t\t年龄\t\t家庭住址\t\t语文成绩\t数学成绩\t英语成绩\t政治成绩\t历史成绩\t平均成绩");


                //这里不用下面代码是为了java中的封装特点
                // System.out.println(list.get(i).id+"\t\t"+list.get(i).name+"\t\t"+list.get(i).age+"\t\t"+ list.get(i).address);
                System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getAddress()+ "\t\t" + stu.getChinese()+ "\t\t" + stu.getMath()+ "\t\t" + stu.getEnglish()+ "\t\t" + stu.getPolitics()+ "\t\t" + stu.getHistory()+ "\t\t" + sum);


        }
        }

    }

