package examples.boot.myboard;

import java.lang.reflect.Method;

public class Test02 {
    public static void main(String[] args) throws Exception{
        // 숫자 1 이 입력 : MyBean001 클래스가 실행되고
        // 숫자 2 ...     MyBean002 ...
        //     n ...     MyBeanN ....
        // 해당 클래스들은 공통적으로 run() 메소드를 가지고 있다.

        Class clazz = Class.forName("examples.boot.myboard.MyBean002");
        Object obj = clazz.newInstance();

        Method runMethod = clazz.getMethod("run", null);
        runMethod.invoke(obj, null);

    }
}

interface MyBean{
    public void run();
}

class MyBean002 {
    public void run(){
        System.out.println("MyBean002 run!");
    }
}

// POJO