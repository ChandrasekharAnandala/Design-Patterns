package prototypeAndRegistryDesignPattern.example1;

public class Client {
    public static void fillRegistry(StudentRegistry registry){
       Student batchAStudent = new Student();
       batchAStudent.setBatch("Batch A");
       batchAStudent.setAvgBatchPsp(75);
       registry.register("batchAStudent",batchAStudent);

       IntelligentStudent batchBStudent = new IntelligentStudent();
        batchBStudent.setBatch("Batch B");
        batchBStudent.setAvgBatchPsp(70);
        registry.register("batchBStudent",batchBStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
        Student chandu = studentRegistry.getStudent("batchAStudent").copy();
        chandu.setName("Chandu");
        chandu.setId(123);
        Student govind = studentRegistry.getStudent("batchBStudent").copy();
        govind.setName("Govind");
        govind.setId(456);
        System.out.println(chandu);
        System.out.println(govind);

    }
}
