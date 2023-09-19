public class EX02 {
    public static void main(String[] args) throws Exception {
        // 创建Cbbb类的对象obj1和obj2
        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();

        // 设置obj1的X和Y值
        obj1.X = 5.2;
        obj1.Y = 3.9;

        // 设置obj2的X和Y值
        obj2.X = 6.5;
        obj2.Y = 4.6;

        // 计算obj1和obj2的X值平均并赋给avg的X
        avg.X = (obj1.X + obj2.X) / 2;

        // 计算obj1和obj2的Y值平均并赋给avg的Y
        avg.Y = (obj1.Y + obj2.Y) / 2;

        // 打印obj1的值
        System.out.println("obj1的X值: " + obj1.X);
        System.out.println("obj1的Y值: " + obj1.Y);

        // 打印obj2的值
        System.out.println("obj2的X值: " + obj2.X);
        System.out.println("obj2的Y值: " + obj2.Y);

        // 打印avg的值
        System.out.println("avg的X值: " + avg.X);
        System.out.println("avg的Y值: " + avg.Y);
    }
}

class Cbbb {
    double X;
    double Y;
}
