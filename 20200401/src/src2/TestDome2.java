package src2;

import src1.Animal;

public class TestDome2 extends Animal {
    public TestDome2(String name,String sex){
        super("name","sex");
    }

    public void func(){
        System.out.println(super.sex);
        //System.out.println(super.count);default 不能访问不同包中的子类
    }

    public static void main(String[] args) {
        Animal animal = new Animal("赵四","雄");
        System.out.println(animal.name);

    }
}
//1.33.45