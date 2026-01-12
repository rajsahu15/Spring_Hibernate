package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	   
	   @Id
	   @Column(name="studernt_ID")
       private int studerntId;
	   @Column(name="studernt_name")
	   private String name;
	   @Column(name="studernt_email")
       private String email;
	   public Student(int studentId,String name, String email) {
		super();
		this.studerntId=studentId;
		this.name = name;
		this.email = email;
	   }
	   public Student() {
		super();
		// TODO Auto-generated constructor stub
	   }
	   public int getStuderntId() {
		   return studerntId;
	   }
	   public void setStuderntId(int studerntId) {
		   this.studerntId = studerntId;
	   }
	   public String getName() {
		   return name;
	   }
	   public void setName(String name) {
		   this.name = name;
	   }
	   public String getEmail() {
		   return email;
	   }
	   public void setEmail(String email) {
		   this.email = email;
	   }
	   
       
}
