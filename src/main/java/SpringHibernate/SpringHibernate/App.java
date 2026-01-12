package SpringHibernate.SpringHibernate;

import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.studentService;
import Entities.Student;


public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context= new ClassPathXmlApplicationContext("Configure/config.xml");
    
    studentService serviceS= context.getBean("studentService",studentService.class);
   /*
    Student std1=new Student (101,"Karn","karn@gmail.com");
    
    int r=serviceS.insertStudent(std1);
    System.out.println(r);
    std1.setName("Sita");
    std1.setStuderntId(102);
    std1.setEmail("sita@gmail.com");
   r=serviceS.insertStudent(std1);
    System.out.println(r);
    
    */
    /*Student std1=new Student (107,"SiyaRam","ram@gmail.com");
    int x=serviceS.updateStudent(std1);
    System.out.println(x);
    */
    /*
    Student s=serviceS.getStudent(107);
    System.out.println(s.getName());
    System.out.println(s.getEmail());
    */
    List al=serviceS.getAllStudent();
    //List iterator
    ListIterator li=al.listIterator();
    while(li.hasNext()) {
		Student s=(Student)li.next();
		System.out.println("ID:"+s.getStuderntId());
		System.out.println("Name:"+s.getName());
		System.out.println("Email:"+s.getEmail());
		System.out.println("******************");
	}
    
    
     
    // System.out.println(serviceS.deleteStudent(106));
    
     }
   
    
}
