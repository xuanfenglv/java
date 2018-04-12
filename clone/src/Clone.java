/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 9:45 2018/4/12
 * @Modified By:
 */
public class Clone implements Cloneable{
    public int a;
    public String b;

    @Override
    protected Clone clone() throws CloneNotSupportedException {
        return (Clone)super.clone();
    }

    public static void main(String[] args) {
        Clone c1 = new Clone();
        c1.a = 1;
        c1.b = "hello";
        Clone c2 = null;
        try {
           c2 = c1.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(c1==c2);
        System.out.println(c2.b);
    }
}
