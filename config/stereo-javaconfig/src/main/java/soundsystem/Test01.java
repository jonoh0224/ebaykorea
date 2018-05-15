package soundsystem;

public class Test01 {
    public static void main(String[] args){
        MyBean003 bean = new MyBean003();
        bean.print();
    }
}

class MyBean003{
    public void print(){
        System.out.println(this.getClass().getName());
    }
}