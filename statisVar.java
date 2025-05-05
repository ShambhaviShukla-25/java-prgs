class staticVarExample{
    //instance or object level variable
    int a=10;
    //class level variable
    static int b=20;
}
public class statisVar {
    public static void main(String[] args) {
        staticVarExample s=new staticVarExample();
        System.out.println("a="+s.a);
        //no need to use object while calling a static variable istead call it using the classname itself
        System.out.println("b="+staticVarExample.b);
    }
}
