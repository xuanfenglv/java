package shadow_clone.demo2;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 10:59 2018/4/12
 * @Modified By:
 */
public class TestClone {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王尼玛",41);
        Student2 xiaoming = new Student2(new String("小明"),12,teacher);
        Student2 xiaoming_Copy = null;
        try {
            xiaoming_Copy = xiaoming.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        xiaoming_Copy.getTeacher().setName("齐东强");
        System.out.println(xiaoming.toString());
        System.out.println(xiaoming_Copy.toString());
    }
}
