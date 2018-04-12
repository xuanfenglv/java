package shadow_clone.demo1;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 10:59 2018/4/12
 * @Modified By:
 */
public class TestClone {
    public static void main(String[] args) {
        Student1 xiaoming = new Student1(new String("小明"),12);
        Student1 xiaoming_Copy = null;
        try {
            xiaoming_Copy = xiaoming.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(xiaoming.toString());
        System.out.println(xiaoming_Copy.toString());
    }
}
