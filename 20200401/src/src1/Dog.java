package src1;

public class Dog extends Animal {
   /* public String name ;
    public void eat(){
        System.out.println(this.name + "正在吃");
    }*/
   public int age;

    public Dog(String name,int age,String sex){
        super(name,sex);//放在第一行
        this.age = 10;
    }
}
