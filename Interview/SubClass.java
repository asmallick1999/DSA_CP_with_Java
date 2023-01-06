package Interview;

public class SubClass extends SuperClass{
    public static void main(String[] args) {
        SubClass inher = new SubClass();
        System.out.println(inher.x);
        inher.func1();
    }
    public void func1(){
        System.out.println("This is from subclass");
    }
}
