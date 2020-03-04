package homework22022020;/* Write a class with the name Person. The class needs three fields
 (instance variables) with the names firstName, lastName of type String
 and age of type int. */

public class No14Person {
    String firstName;
    String lastName;
    int age;


    public static void main(String[] args) {

        No14Person person = new No14Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }

    public String getFirstName() {

        return "firstName";
    }

    public String getLastName() {
        return "lastName";


    }


    public int getAge() {


        return age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
        getFirstName();

    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        getLastName();
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {

            System.out.println("Age should be 1 to 100");


        }

    }




    public String isTeen() {

        if (age > 12 && age < 20) {
            System.out.println("Teen = True");
        } return String.valueOf((getAge()));

    }




    public String getFullName() {

        if (firstName.isEmpty()) {
            return getFirstName();
        } else if (lastName.isEmpty()) {
            return getLastName();
        } else return getFirstName();


    }



}
