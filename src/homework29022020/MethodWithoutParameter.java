package homework29022020;

public class MethodWithoutParameter {

    //instance method
    int a = 10;
    int b = 20;

    //main method
    public static void main(String[] args) {
        MethodWithoutParameter m = new MethodWithoutParameter();
        m.noParameterIn();//calling instance method to main method
        MethodWithoutParameter.noParameterSta();

    }

    //instance method no return type and no parameter
    public void noParameterIn() {
        System.out.println(a);//printing a variable
        System.out.println(b);//printing b variable
    }

    //static method no return type and no parameter
    public static void noParameterSta() {
        MethodWithoutParameter m1 = new MethodWithoutParameter();//object creation
        System.out.println(m1.a);//calling instance variable to static method
        System.out.println(m1.b);//calling instance variable to static method
    }


}
