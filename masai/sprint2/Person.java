package sprint2;

public class Person {
    String name;
    String gender;
}
class address extends Person{
    String city;
    String state;
    String pinCode;
}
class Instructor extends Person{
    int instructorId;
    int salary;
}
class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;
}
class Main extends Person{
    public static Person generatePerson(Person person){
        return person;
    }
    public static void main(String[] args) {
        Person newStudent = generatePerson(new Student());
        Person newInstructor = generatePerson(new Instructor());

    }
}
