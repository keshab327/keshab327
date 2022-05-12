package np.com.westernit.LMS.entity;

//import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity


public class mystudent{
	
	@Id
	@GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
	private int id;
	
	@Column(name="first_name")
	private String firstname;
	
	public mystudent(int id, String k)
	{
		
		this.id=id;
		this.firstname=k;
	}
	
	
	public void set_id(int id)
	{
		this.id=id;
	}
	
	public void set_name(String name)
	{
		this.firstname=name;
	}
	
	
	
	public int getid()
	{
		
		return this.id;
	}
	
	public String get_name()
	{
		return this.firstname;
		
		
	}
}
