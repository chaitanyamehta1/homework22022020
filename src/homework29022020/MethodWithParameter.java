package homework29022020;

public class MethodWithParameter {
    // static variable
    static int a = 50;
    static int b = 100;

    //main method
    public static void main(String[] args) {
        MethodWithParameter m = new MethodWithParameter();//object creation
        m.methodWithParaInst(10, 20);//calling instance method with 2 parameter
        methodWithParaStat(30, 40);//calling static method with 2 parameter
    }

    //instance method no return type and 2 parameter
    public void methodWithParaInst(int a, int b) {
        System.out.println(a + b);//printing sub total for 2 parameter
        System.out.println(MethodWithParameter.a);//printing static variable
        System.out.println(MethodWithParameter.b);//printing static variable
    }

    //static method no return type and 2 parameter
    public static void methodWithParaStat(int c, int d) {
        System.out.println(c + d);//printing sub total for 2 parameter
        System.out.println(a);//printing static variable
        System.out.println(b);//printing static variable
    }
}