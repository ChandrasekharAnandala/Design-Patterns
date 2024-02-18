package builderDesignPattern.example1;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setStudentId(123)
                .setStudentName("Chandu")
                .setPsp(60)
                .setUniversity("SVCET")
                .build();
        System.out.println(student);
    }
}
