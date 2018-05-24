package soundsystem;

import org.springframework.beans.factory.BeanNameAware;

public class MyDisc implements CompactDisc, BeanNameAware {
    private String beanId;
    @Override
    public void play() {
        System.out.println("MyDisc!!!");
    }

    @Override
    public void setBeanName(String s) {
        this.beanId = s;
        System.out.println("+++++++++++++++++++++++");
        System.out.println(s);
        System.out.println("+++++++++++++++++++++++");
    }
}
