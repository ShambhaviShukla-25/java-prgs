//Contructor types and constructor overloading
class Constructor{
    String name;
    int age;
    //default constructor
    Constructor(){
        name="Shambhavi";
        age=19;
    }
    //parameterized constuctor
    Constructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    //copy constructor
    Constructor(Constructor cons2){
        this.name=cons2.name;
        this.age=cons2.age;
    }
}
public class ConstructorCall {
    public static void main(String[] args){
        Constructor cons1=new Constructor();
        System.out.println("Constructor1 name:"+cons1.name+" Constructor1 age:"+cons1.age);
        Constructor cons2=new Constructor("Vaishnavi",25);
        System.out.println("Constructor2 name:"+cons2.name+" Constructor2 age:"+cons2.age);
        Constructor cons3=new Constructor(cons2);
        System.out.println("Constructor3 name:"+cons3.name+" Constructor3 age:"+cons3.age);
    }
}
