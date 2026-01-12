package DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import Entities.Student;

public class studentService {

	private HibernateTemplate hibernateTemp;
	
	@Transactional
	public int insertStudent(Student std)
	
	{
		int i=(int)hibernateTemp.save(std);
		return i;
	}
	@Transactional
	public int deleteStudent(int id) {
		Student std=hibernateTemp.get(Student.class,id);
		if(std!=null) {
		hibernateTemp.delete(std);
		return 1;
		}
		return 0;
		
	}
	
	@Transactional
	public int updateStudent(Student std) {
		if(std!=null) {
		hibernateTemp.update(std);
		return 1;
		}
		return 0;
		
	}
	
	public Student getStudent(int id)
	{
		return hibernateTemp.get(Student.class, id);
	}
	
	public List<Student> getAllStudent(){
		
		return (List<Student>)hibernateTemp.loadAll(Student.class);
	
	}
	
	
	
	
	
	
	
	
	

	public HibernateTemplate getHibernateTemp() {
		return hibernateTemp;
	}

	public void setHibernateTemp(HibernateTemplate hibernateTemp) {
		this.hibernateTemp = hibernateTemp;
	}
}
