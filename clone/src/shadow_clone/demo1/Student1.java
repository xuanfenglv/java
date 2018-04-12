package shadow_clone.demo1;

import com.alibaba.fastjson.JSON;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 10:58 2018/4/12
 * @Modified By:
 */
public class Student1 implements Cloneable{
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Student1 clone() throws CloneNotSupportedException {
        return (Student1)super.clone();
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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
