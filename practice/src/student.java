import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class student {
    //用来定义学生 学生有编号 id 姓名name 年龄age 家庭住址 address 学生各科成绩 Chinese Math English Politics History
    private String id;
    private String name;
    private int age;
    private String address;


    public student() {
    }

    public student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }


    //写关于增删改查的方法 写为静态方法可以直接调用
    public static void addstudy(ArrayList<Course> list) {

        System.out.println("添加学生");
        //创建学生对象
        Course s = new Course();
        //键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生id");
        //用j来判断是否id成功进入
        int j = 0;
        //判断id是否唯一
        while (j == 0) {
            //输入的id
            String id = sc.next();
            int i;
            //遍历看集合中id是都已经存在
            for (i = 0; i < list.size(); ++i) {
                student stu = list.get(i);
                String stuid = stu.getId();
                if (stuid.equals(id)) {
                    System.out.println("此id已经存在请重新输入");
                    break;
                }
            }
            //如果i跑完说明没有找到 此时可以输入id
            if (i == list.size()) {
                s.setId(id);
                j = 1;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭住址");
        String address = sc.next();
        s.setAddress(address);
        System.out.println("请输入语文成绩");
        int chinese = sc.nextInt();
        s.setChinese(chinese);
        System.out.println("请输入数学成绩");
        int math = sc.nextInt();
        s.setChinese(math);
        System.out.println("请输入英语成绩");
        int english = sc.nextInt();
        s.setChinese(english);
        System.out.println("请输入政治成绩");
        int politics = sc.nextInt();
        s.setChinese(politics);
        System.out.println("请输入历史成绩");
        int history = sc.nextInt();
        s.setChinese(history);


        //将信息添加到集合中去
        list.add(s);
        //看集合中有多少
        System.out.println("添加成功");
        System.out.println(list.size());


    }

    public static void deletestudy(ArrayList<Course> list) {
        System.out.println("删除学生");
        System.out.println("请输出要删除的学生id");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();

        //用i来跑集合 用j来记录集合长度 不然删除最后一个的时候容易混淆
            int i;int j=list.size();
            //遍历看集合中id是否存在
            for (i = 0; i < list.size(); ++i) {
                Course stu = list.get(i);
                String stuid = stu.getId();
                if (stuid.equals(id)) {
                    //找到了就可以进行删除
                    list.remove(i);
                    System.out.println("删除成功");
                    break;
                }
            }

            //如果i跑完说明没有找到
            if (i == j) {
                System.out.println("没有此学生信息");
                return;
            }
        }



    public static void modifystudy(ArrayList<Course> list) {
        System.out.println("修改学生");
        System.out.println("请输出要修改学生的id");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        //用i来跑集合 用j来记录集合长度 不然删除最后一个的时候容易混淆
        int i;int j=list.size();
        //遍历看集合中id是否存在
        for (i = 0; i < list.size(); ++i) {
            Course stu = list.get(i);
            String stuid = stu.getId();
            if (stuid.equals(id)) {
                //找到了就可以进行修改
                System.out.println("找到请输入要修改信息");
                System.out.println("请输出新的姓名");
                String newname=sc.next();
                //修改集合中的信息
                stu.setName(newname);
                System.out.println("请输出新的年龄");
                int newage=sc.nextInt();
                //修改集合中的信息
                stu.setAge(newage);
                System.out.println("请输出新的地址");
                String newaddress=sc.next();
                //修改集合中的信息
                stu.setAddress(newaddress);
                System.out.println("请输出新的语文成绩");
                int newchinese=sc.nextInt();
                //修改集合中的信息
                stu.setChinese(newchinese);
                System.out.println("请输出新的数学成绩");
                int newmath=sc.nextInt();
                //修改集合中的信息
                stu.setMath(newmath);
                System.out.println("请输出新的英语成绩");
                int newenglish=sc.nextInt();
                //修改集合中的信息
                stu.setEnglish(newenglish);
                System.out.println("请输出新的政治成绩");
                int newpolitics=sc.nextInt();
                //修改集合中的信息
                stu.setPolitics(newpolitics);
                System.out.println("请输出新的历史成绩");
                int newhistory=sc.nextInt();
                //修改集合中的信息
                stu.setHistory(newhistory);

                System.out.println("修改成功");

            }
        }

        //如果i跑完说明没有找到
        if (i == j) {
            System.out.println("要修改的id"+id+"不存在，请重新输入");
            return;
        }


    }

    public static void querystudy(ArrayList<Course> list) {
        //查询的功能 如果没有信息就返回空 不然就输出学生的信息 包括id 姓名 年龄 地址
        System.out.println("查询学生");

        if (list.size() == 0) {
            System.out.println("还没有存储学生信息");
            return;
        } else {
            //使用制表符让各个数据对齐

            System.out.println("ID\t\t姓名\t\t年龄\t\t家庭住址\t\t语文成绩\t数学成绩\t英语成绩\t政治成绩\t历史成绩");
            for (int i = 0; i < list.size(); i++) {


                //这里不用下面代码是为了java中的封装特点
                // System.out.println(list.get(i).id+"\t\t"+list.get(i).name+"\t\t"+list.get(i).age+"\t\t"+ list.get(i).address);
                Course stu = list.get(i);
                System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getAddress()+ "\t\t" + stu.getChinese()+ "\t\t" + stu.getMath()+ "\t\t" + stu.getEnglish()+ "\t\t" + stu.getPolitics()+ "\t\t" + stu.getHistory());

            }
        }
    }


    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "student{id = " + id + ", name = " + name + ", age = " + age + ", address = " + address + "}";
    }

}
