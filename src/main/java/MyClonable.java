import java.util.Date;

public class MyClonable {
    public static void main(String[] args) {
        A obj1 = new A(10);
        A obj2 = obj1.clone();
        System.out.println(obj1.getD());
        System.out.println(obj2.getD());
        obj2.newDate(1245L);
        System.out.println(obj1.getD());
        System.out.println(obj2.getD());
    }


static class A implements Cloneable {
    private int x;
    private Date d;   // Изменяемый объект!

    public A(int x) {
        this.x = x;
        this.d = new Date();
    }
    public int getX() {
        return this.x;
    }
    public Date getD() {
        // Изменяемые объекты возвращаем только так!
        return (Date) this.d.clone();
    }
    public void newDate(long time) {
        this.d.setTime(time);
    }
    @Override
    public A clone() {
        A obj = null;
        try {
            obj = (A) super.clone(); // Вызов метода из класса Object
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.exit(1);
        }
        obj.d = (Date) this.d.clone();
        return obj;
    }
}
}
