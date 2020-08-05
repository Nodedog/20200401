package src1;

public class Sheep extends Animal {
  /*  public String name ;

    public void eat(){
        System.out.println(this.name + " 正在吃");
    }*/
    public void run(){
        System.out.println(this.name + " 正在跑");
    }


    public Sheep(String name,String sex){
        super(name,sex);
    }
}
