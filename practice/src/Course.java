import java.util.ArrayList;
import java.util.Scanner;

public class Course extends student{ //课程的类 继承了学生类
    private int Chinese;
    private int Math;
    private int  English ;
    private int Politics;
    private int History;




    public Course() {
    }

    public Course(int Chinese, int Math, int English, int Politics, int History) {
        this.Chinese = Chinese;
        this.Math = Math;
        this.English = English;
        this.Politics = Politics;
        this.History = History;
    }

    /**
     * 获取
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return Math
     */
    public int getMath() {
        return Math;
    }

    /**
     * 设置
     * @param Math
     */
    public void setMath(int Math) {
        this.Math = Math;
    }

    /**
     * 获取
     * @return English
     */
    public int getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(int English) {
        this.English = English;
    }

    /**
     * 获取
     * @return Politics
     */
    public int getPolitics() {
        return Politics;
    }

    /**
     * 设置
     * @param Politics
     */
    public void setPolitics(int Politics) {
        this.Politics = Politics;
    }

    /**
     * 获取
     * @return History
     */
    public int getHistory() {
        return History;
    }

    /**
     * 设置
     * @param History
     */
    public void setHistory(int History) {
        this.History = History;
    }

    public String toString() {
        return "Course{Chinese = " + Chinese + ", Math = " + Math + ", English = " + English + ", Politics = " + Politics + ", History = " + History + "}";
    }
}
