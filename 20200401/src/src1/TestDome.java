package src1;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class TestDome {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("羊羊","雄");
        sheep.eat();
        sheep.run();
        System.out.println(sheep.sex);
    }

    public static void main1(String[] args) {
        Dog dog1 = new Dog("狗狗二号",10,"雄");
        int a = dog1.age;
        System.out.println("狗狗二号的年龄是" + a + "岁");
        dog1.eat();
        System.out.println(dog1.sex);
    }

}
