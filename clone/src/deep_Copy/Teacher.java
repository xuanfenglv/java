package deep_Copy;

import com.alibaba.fastjson.JSON;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 11:11 2018/4/12
 * @Modified By:
 */
public class Teacher implements Cloneable{
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        return (Teacher)super.clone();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
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
}
