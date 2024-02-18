package builderDesignPattern.example1;

public class Student {

    int studentId;
    String studentName;
    float psp;
    String university;

    private Student() {
    }

    private Student(int studentId, String studentName, float psp, String university) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.psp = psp;
        this.university = university;
    }
    private Student(Builder builder){
        this.studentId = builder.studentId;
        this.studentName = builder.studentName;
        this.psp = builder.psp;
        this.university = builder.university;
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

    public static Builder getBuilder(){
        return new Builder();
    }
    static class Builder{
        int studentId;
        String studentName;
        float psp;
        String university;

        public int getStudentId() {
            return studentId;
        }

        public Builder setStudentId(int studentId) {
            this.studentId = studentId;
            return this;
        }

        public String getStudentName() {
            return studentName;
        }

        public Builder setStudentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public float getPsp() {
            return psp;
        }

        public Builder setPsp(float psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }
        public Student build() {
            try {
                if (this.psp < 70) {
                    throw new Exception("PSP should be at least 70 percent");
                }
                return new Student(this);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            return null;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", psp=" + psp +
                ", university='" + university + '\'' +
                '}';
    }
}
