import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="account_no")
	private int acno;
	
	private String name;
	
	private String type;
	
	@OneToOne(cascade=CascadeType.ALL /*mappedBy="account"*/)
	@JoinColumn(name="account_plus_id")
	private Accountplus accountplus;

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Accountplus getAccountplus() {
		return accountplus;
	}

	public void setAccountplus(Accountplus accountplus) {
		this.accountplus = accountplus;
	}
	
	
	
	
	
	
	

}
