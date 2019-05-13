package hello;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Department {
	
	@Id
	@GeneratedValue
	public int did;
	public String dname;
	public String length;
	//@ManyToMany(targetEntity = Employee.class)
	//public Set eset;
	
	
	public Department(String dname, String length) {
		super();
		this.dname = dname;
		this.length = length;
	}


	/*public Department(int did, String dname, String length) {
		super();
		this.did = did;
		this.dname = dname;
		this.length = length;
	}*/
	

	
	
}
