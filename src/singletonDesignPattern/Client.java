package singletonDesignPattern;

public class Client {
    public static void main(String[] args) {

        /*
        * The main objective of singleton design pattern is to create only one instance per class
        * When the object creation is too expensive we can choose this design pattern
        * For Eg. Creating db connection objective is expensive operation
        * Springs boot default object scope is Singleton Eg. @Component, @Service, @Bean etc*/
        Student student = Student.getInstance();
        Student student1 = Student.getInstance();

        System.out.println(student);
        System.out.println(student1);
    }
}
