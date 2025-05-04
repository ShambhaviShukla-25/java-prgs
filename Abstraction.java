import packP.Pen;
class FountainPen extends Pen{
    public void write(){
        System.out.println("Write");
    }
    public void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Change the nib");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        FountainPen fp= new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}