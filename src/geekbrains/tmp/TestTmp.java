package geekbrains.tmp;
public class TestTmp {
    public static void main(String[] args) {
        String a[]={"qw", "bbbb", "4354","34","5442","cccc"};

        for (int i=0; i<=a.length-1; i++){
            if (a[i].matches("[0-9]*")) {
                System.out.println("a["+a[i]+"] - Число!!!");
            } else {
                System.out.println("a["+a[i]+"] - не является числом");
            }
        }
    }
}
