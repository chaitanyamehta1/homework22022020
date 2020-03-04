package homework29022020;


//Java program to overload constructors
    class No20Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    No20Student5(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    No20Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        No20Student5 s1 = new No20Student5(111, "Karan");
        No20Student5 s2 = new No20Student5(222, "Aryan", 25);
        s1.display();
        s2.display();

    }
}
