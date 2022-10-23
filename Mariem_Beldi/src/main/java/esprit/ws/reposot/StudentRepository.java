package esprit.ws.reposot;

import java.util.ArrayList;
import java.util.List;

import esprit.ws.entities.Student;

public class StudentRepository {
	
	private final List<Student> students;
	
	
	public StudentRepository()
	{
		
		students=new ArrayList<Student>();
		
		students.add(new Student("123", "ben foulen ahmed","ahmed@gmail.com"));
		students.add(new Student("456", "ben ahmed ala","alaaa@gmail.com"));
	}
	
	
	
	
	public List<Student>getListStudent()
	{return students;}

	public Student getStudentByCin(String cin)
	{
		for (Student S:this.students)
		{if (S.getCin().equals(cin))
			
		return S;
		
		}
		return null;
		
		}
	public Student createStudent(Student s) {
	    this.students.add(s);
	    return s;
	    
	}
	public Student updateStudent(Student student) {
	    for (Student S:this.students)
        {
	        if (S.getCin().equals(student.getCin()))
        {    S.setEmail(student.getEmail());
            S.setNompre(student.getNompre());
        return S;
        }
        
    }
	    return student;
	}
	
	   public Student deleteStudent(Student student) {
	        for (Student S:this.students)
	        {
	            if (S.getCin().equals(student.getCin()))
	        { students.remove(student);
	        return student;
	        }
	        
	    }
	        return student;
	    }
}
