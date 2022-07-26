import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Accountplus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="account_plus_id")
	private int accountplusid;
	@OneToOne
	@JoinColumn(name="account_no")
	private Account account;
	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	private int amount;


	public int getAccountplusid() {
		return accountplusid;
	}


	public void setAccountplusid(int accountplusid) {
		this.accountplusid = accountplusid;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}





}
