package singletonDesignPattern;

public class Student {
    int studentId;
    String studentName;
    float psp;
    String university;

    private static Student student = null;

    private Student() {
    }

    private Student(int studentId, String studentName, float psp, String university) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.psp = psp;
        this.university = university;
    }

    public static synchronized Student getInstance(){
        if(student == null){
            synchronized (Student.class){
                if(student == null){
                student = new Student();
                }
            }
        }
        return student;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getPsp() {
        return psp;
    }

    public void setPsp(float psp) {
        this.psp = psp;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
