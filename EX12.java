class CWin {
    int width;
    int height;
    String name;

    void setW(int w) {
        width = w;
    }

    void setH(int h) {
        height = h;
    }

    void setName(String s) {
        name = s;
    }

    void setWindow(int w, int h) {
        width = w;
        height = h;
    }

    void setWindow(int w, int h, String s) {
        width = w;
        height = h;
        name = s;
    }

    public void show() {
        System.out.println("Name=" + name);
        System.out.println("W=" + width + ", H=" + height);
    }
}

public class EX12 {
    public static void main(String args[]) {
        CWin cw = new CWin();
        cw.setName("My Window");
        cw.setW(5);
        cw.setH(3);
        cw.show();
        
        // 使用setWindow函数
        cw.setWindow(8, 6);
        cw.show();
        
        // 使用多载的setWindow函数
        cw.setWindow(10, 4, "New Window");
        cw.show();
    }
}
