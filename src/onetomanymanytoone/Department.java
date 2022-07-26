package onetomanymanytoone;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_tbl")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d_id")
	private int did;
   @Column(name="d_name")
	private String dname;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="department")
	private Set<Employee> semp=new HashSet<Employee>();
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Set<Employee> getSemp() {
		return semp;
	}
	public void setSemp(Set<Employee> semp) {
		this.semp = semp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
