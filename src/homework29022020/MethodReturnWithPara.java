package homework29022020;

public class MethodReturnWithPara {
    //    main method
    public static void main(String[] args) {
        MethodReturnWithPara p = new MethodReturnWithPara();//object creation
        //System.out.println(p.MethodReturnWithPar(10,20));//printing statement
        int sub = p.MethodReturnWithPar(10, 20);//passing parameter
        System.out.println(sub);//printing statement

        //System.out.println(p.MethodReturnWithParam("Chaitanya", "Mehta"));//printing statement
        String fullName = p.MethodReturnWithParam("Chaitanya", "Mehta");//passing parameter
        System.out.println(fullName);//printing statement
    }

    //return type int method with 2 parameter
    public int MethodReturnWithPar(int a, int b) {
        int sub;//total addition of sum
        sub = a + b;//addition sub
        return sub;//returning sub
    }

    // return type string method with 2 parameter
    public String MethodReturnWithParam(String Chaitanya, String Mehta) {
        String fullName;//joining 2 name reference
        fullName = Chaitanya + " " + Mehta; // joining 2 name
        return fullName;//returning full name
    }


}
