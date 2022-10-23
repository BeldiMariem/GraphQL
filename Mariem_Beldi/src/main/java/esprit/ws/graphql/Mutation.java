package esprit.ws.graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.ws.entities.Student;
import esprit.ws.reposot.StudentRepository;

public class Mutation implements GraphQLRootResolver{
    private final StudentRepository studentRepository;
    public Mutation(StudentRepository stdR)
    {
        this.studentRepository=stdR;

    }
    public Student createStudent(String cin, String nompre,String email) {
        Student s = new Student(cin,nompre,email);
        this.studentRepository.createStudent(s);
        return s;
    }
    public Student updateStudent(String cin, String nompre,String email) {
        Student s = new Student(cin,nompre,email);
        this.studentRepository.updateStudent(s);
        return s;
    }
    public Student deleteStudent(String cin, String nompre,String email) {
        Student s = new Student(cin,nompre,email);
        this.studentRepository.deleteStudent(s);
        return s;
    }
    

}
