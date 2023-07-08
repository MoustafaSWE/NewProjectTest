package oop.encapsulation;

public class StudentNormalCase {

    String name = "Ahmed";
    int age = 25;
    String address = "Giza";

    public String toString() {
        return ("Student name is: " + this.name + " , age is: " + this.address
                + " and Address is: " + this.address);
    }

    public static void main(String[] args) {
        StudentNormalCase studentNormalCase = new StudentNormalCase();
        System.out.println(studentNormalCase.toString());
    }
}
