package examples.boot.myboard;

public class Test01 {
    public static void main(String[] args) throws Exception{
//        MyBean01 bean = new MyBean01();

        Class clazz = Class.forName("examples.boot.myboard.MyBean01");
//        Object obj = clazz.newInstance();
    }
}

class MyBean01{
    static int i;
    static{
        i = 10 * 5;
        System.out.println("hello!!!");
    }
}