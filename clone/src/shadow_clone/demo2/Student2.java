package shadow_clone.demo2;

import com.alibaba.fastjson.JSON;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 11:08 2018/4/12
 * @Modified By:
 */
public class Student2 implements Cloneable {
    private String name;
    private int age;
    private Teacher teacher;

    public Student2(String name, int age, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.teacher = teacher;
    }

    @Override
    public Student2 clone() throws CloneNotSupportedException {
        return (Student2)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
