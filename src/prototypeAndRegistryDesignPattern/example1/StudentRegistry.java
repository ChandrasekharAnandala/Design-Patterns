package prototypeAndRegistryDesignPattern.example1;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> map = new HashMap<>();

    public void register(String name, Student student){
        map.put(name, student);
    }
    public Student getStudent(String name){
        return map.get(name);
    }
}
