public class EX07 {
    public void test(int value) {
        if (value == 0) {
            System.out.println("此數為0");
        } else if (value % 2 == 0) {
            System.out.println("此為偶數");
        } else {
            System.out.println("此數為奇數");
        }
    }

    public static void main(String[] args) {
        EX07 tester = new EX07();

        // 判斷3是奇數還是偶數
        tester.test(3);

        // 判斷8是奇數還是偶數
        tester.test(8);

        // 判斷0
        tester.test(0);
    }
}
