package src1;

public class Animal {
    public String name ;

    protected  String sex;
    int count;

    public void eat(){
        System.out.println(this.name + " 正在吃");
    }

    public Animal(String name,String sex){
        this.name = name;
        this.sex = sex;
    }


}
