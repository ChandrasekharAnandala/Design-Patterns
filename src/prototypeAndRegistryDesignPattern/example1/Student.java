package prototypeAndRegistryDesignPattern.example1;

public class Student implements Prototype{
     int id;
     String name;
     float avgBatchPsp;
     String batch;

    public Student(){}
    public Student(Student student){
        this.id = student.id;
        this.name = student.name;
        this.avgBatchPsp = student.avgBatchPsp;
        this.batch = student.batch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(float avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Student copy(){
        Student student = new Student(this);
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avgBatchPsp=" + avgBatchPsp +
                ", batch='" + batch + '\'' +
                '}';
    }
}
