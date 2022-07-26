package manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="stu_tbl")
public class Student {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="roll_no")
	private int rollno;
   
   private String name;
   @ManyToMany(cascade=CascadeType.ALL)
   @JoinTable(name="student_course",joinColumns=
{@JoinColumn(name="roll_no")},
   inverseJoinColumns={@JoinColumn(name="c_id")}
		   )
   private Set<Course> scourse=new HashSet<Course>();
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Course> getScourse() {
	return scourse;
}
public void setScourse(Set<Course> scourse) {
	this.scourse = scourse;
}
   
   
   
   
   
   
   
   
   
   
   
}
