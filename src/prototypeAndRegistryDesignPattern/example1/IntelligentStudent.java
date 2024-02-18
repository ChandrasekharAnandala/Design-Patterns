package prototypeAndRegistryDesignPattern.example1;

public class IntelligentStudent extends Student{
    int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent intelligentStudent){
        this.id = intelligentStudent.id;
        this.name = intelligentStudent.name;
        this.avgBatchPsp = intelligentStudent.avgBatchPsp;
        this.batch = intelligentStudent.batch;
        this.iq = intelligentStudent.iq;
    }
    @Override
    public IntelligentStudent copy(){
        IntelligentStudent intelligentStudent = new IntelligentStudent(this);
        return intelligentStudent;
    }
}
