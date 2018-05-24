package examples.boot.myboard;

public class Test2 {
    /*public static void main(String[] args){
        String str = "";
        for(int i = 0; i < 100; i++){
            str = str + "*";
        }
        System.out.println(str);
    }*/
    public static void main (String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("examples.boot.myboard.MyBean01");
    }
}

class MyBean02{
    static{
        System.out.println("hello!");
    }
}


